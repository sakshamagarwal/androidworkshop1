package com.example.saksham.demodiceapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView = new ListView(MainActivity.this);
        final CharacterAdapter adapter = new CharacterAdapter(MainActivity.this, new ArrayList<GOTCharacter>());
        listView.setAdapter(adapter);

        setContentView(listView);

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://spreadsheets.google.com").build();
        DataFetcher fetcher = retrofit.create(DataFetcher.class);
        Call<ResponseBody> call = fetcher.getData();

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    String result = response.body().string();
                    int start = result.indexOf("{");
                    int end = result.lastIndexOf("}") + 1;
                    result = result.substring(start, end);
                    JSONObject resultJSONStr = new JSONObject(result);
                    JSONObject table = resultJSONStr.getJSONObject("table");
                    JSONArray rows = table.getJSONArray("rows");
                    adapter.clear();
                    for (int i = 0; i < rows.length(); ++i) {
                        JSONObject r = rows.getJSONObject(i);
                        JSONArray character = r.getJSONArray("c");
                        String name = character.getJSONObject(0).getString("v");
                        String house = character.getJSONObject(1).getString("v");
                        String origin = character.getJSONObject(2).getString("v");
                        String imageLink = character.getJSONObject(3).getString("v");
                        GOTCharacter gotCharacter = new GOTCharacter(name, house, origin, imageLink);
                        adapter.add(gotCharacter);
                    }

                } catch (IOException e) {
                    Toast.makeText(MainActivity.this, "IOException: " + e.toString(), Toast.LENGTH_LONG).show();
                } catch (JSONException e) {
                    Toast.makeText(MainActivity.this, "JSONException: " + e.toString(), Toast.LENGTH_LONG).show();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_LONG).show();
            }
        });



    }

    private class CharacterAdapter extends ArrayAdapter<GOTCharacter> {

        public CharacterAdapter(Activity context, List<GOTCharacter> gotCharacters) {
            super(context, 0, gotCharacters);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            GOTCharacter gotCharacter = getItem(position);
            if (convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.character_layout, null);
            }
            TextView name = (TextView)convertView.findViewById(R.id.character_name);
            TextView house = (TextView)convertView.findViewById(R.id.character_house);
            TextView origin = (TextView)convertView.findViewById(R.id.character_origin);
            ImageView pic = (ImageView)convertView.findViewById(R.id.character_image);

            name.setText(gotCharacter.getName());
            house.setText(gotCharacter.getHouse());
            origin.setText(gotCharacter.getOrigin());

            Picasso.with(getContext()).load(gotCharacter.getImageLink()).into(pic);

            return convertView;
        }
    }

    private class GOTCharacter {
        String name, house, origin, imageLink;

        public GOTCharacter(String name, String house, String origin, String imageLink) {
            this.name = name;
            this.house = house;
            this.origin = origin;
            this.imageLink = imageLink;
        }

        public String getHouse() {
            return house;
        }

        public String getName() {
            return name;
        }

        public String getOrigin() {
            return origin;
        }

        public String getImageLink() {
            return imageLink;
        }
    }

    interface DataFetcher {
        @GET("tq?key=1L6kJKBmJ5jmpdU3iRvXOIcSBf66T8LJtKo7pwzUyYOk")
        Call<ResponseBody> getData();
    }


}
