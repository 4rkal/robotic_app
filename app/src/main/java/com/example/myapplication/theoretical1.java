package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class theoretical1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theoretical1);
        Button practical = (Button)findViewById(R.id.button2);
        Button consulting = (Button)findViewById(R.id.button);
        consulting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(theoretical1.this,Consulting.class );
                startActivity(intent);
            }
        });
        practical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(theoretical1.this,Law.class );
                startActivity(intent);
            }
        });

    }
}