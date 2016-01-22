package com.example.saksham.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView result;
    EditText input1, input2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input1 = (EditText)findViewById(R.id.input1);
        input2 = (EditText)findViewById(R.id.input2);
        result = (TextView)findViewById(R.id.result);
    }


    public void calculate(View view) {
        int a = Integer.parseInt(input1.getText().toString());
        int b = Integer.parseInt(input2.getText().toString());

        switch (view.getId()) {
            case R.id.plus:
                result.setText(Integer.toString(a + b));
                break;

            case R.id.minus:
                result.setText(Integer.toString(a - b));
                break;
            case R.id.mul:
                result.setText(Integer.toString(a * b));
                break;
            case R.id.div:
                result.setText(Integer.toString(a / b));
                break;
        }
    }
}
