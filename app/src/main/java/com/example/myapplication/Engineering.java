package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Engineering extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);
        Button civil  = (Button)findViewById(R.id.button6);
        Button industrial = (Button)findViewById(R.id.button5);
        Button mechanical = (Button)findViewById(R.id.button4);
        Button electrical = (Button)findViewById(R.id.button2);
        Button chemical = (Button)findViewById(R.id.button);
        civil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Engineering.this,Engineering.class );
                startActivity(intent);
            }
        });
    }
}