package com.example.saksham.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView result = (TextView)findViewById(R.id.result);
        final EditText input1 = (EditText)findViewById(R.id.input1);
        final EditText input2 = (EditText)findViewById(R.id.input2);

        Button plus = (Button)findViewById(R.id.plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a = Integer.parseInt(input1.getText().toString());
                int b = Integer.parseInt(input2.getText().toString());
                result.setText(Integer.toString(a + b));
            }
        });
    }


}
