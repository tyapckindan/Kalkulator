package com.example.calculator;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String val1 = getIntent().getExtras().getString("var1");
        String val2 = getIntent().getExtras().getString("var2");

            int vl1 = Integer.parseInt(val1);
            int vl2 = Integer.parseInt(val2);

            int res = (Integer.parseInt(val1) + (Integer.parseInt(val2)));

            TextView text = findViewById(R.id.outputText);
            if (vl2 >= 0) {
                text.setText(vl1 + " + " + vl2 + " = " + res);
            } else {
                text.setText(vl1 + " + " + "(" + vl2 + ")" + " = " + res);
            }
    }
}