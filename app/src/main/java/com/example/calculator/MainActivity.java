package com.example.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText text = findViewById(R.id.txt);
        EditText text2 = findViewById(R.id.txt2);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(view -> {
            Intent intent = new Intent(
                    MainActivity.this,
                    ResultActivity.class);
            if (text.length() != 0 & text2.length() != 0)
            {
                intent.putExtra("var1", text.getText().toString());
                intent.putExtra("var2", text2.getText().toString());
                startActivity(intent);
            }
            else
            {
                Toast.makeText(this, "Некорректные данные.", Toast.LENGTH_LONG).show();
            }
        });
    }
}