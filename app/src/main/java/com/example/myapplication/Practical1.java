package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Practical1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical1);
        Button nothing = (Button)findViewById(R.id.button3);
        Button engineering = (Button)findViewById(R.id.button);
        nothing.setEnabled(false);
            engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Practical1.this,Engineering.class );
                startActivity(intent);
            }
        });
    }
}