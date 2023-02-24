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
                Intent intent = new Intent(Engineering.this,civil.class );
                startActivity(intent);
            }
        });
        industrial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Engineering.this,industrial.class );
                startActivity(intent);
            }
        });
        mechanical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Engineering.this,mechanical.class );
                startActivity(intent);
            }
        });
        electrical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Engineering.this,electrical.class );
                startActivity(intent);
            }
        });
        chemical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Engineering.this,chemical.class );
                startActivity(intent);
            }
        });
    }
}