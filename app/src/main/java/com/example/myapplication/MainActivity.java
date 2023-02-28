package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.gesture.Gesture;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {
//    RelativeLayout relativeLayout;
//    SwipeListener swipeListener;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
//        swipeListener = new SwipeListener(relativeLayout);

        Button practical = (Button)findViewById(R.id.button2);
        Button theoretical = (Button)findViewById(R.id.button);
        practical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                Intent intent = new Intent(MainActivity.this,Practical1.class );
                startActivity(intent);
            }
        });
        theoretical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                Intent intent = new Intent(MainActivity.this,theoretical1.class );
                startActivity(intent);
            }
        });

    }

//    private class SwipeListener implements  View.OnTouchListener {
//        GestureDetector gestureDetector;
//
//        SwipeListener(View view){
//            int threshold = 100;
//            int velocity_threshold = 100;
//
//            GestureDetector.SimpleOnGestureListener listener =
//                    new GestureDetector.SimpleOnGestureListener(){
//                        @Override
//                        public boolean onDown(MotionEvent e) {
//                            return true;
//                        }
//
//                        @Override
//                        public boolean onFling(@NonNull MotionEvent e1, @NonNull MotionEvent e2, float velocityX, float velocityY) {
//                            float xDiff = e2.getX() - e1.getX();
//                            float yDiff = e2.getY() - e1.getY();
//                            try{
//                                if (Math.abs(xDiff) > Math.abs(yDiff)){
//                                    if (Math.abs(xDiff) > threshold
//                                            && Math.abs(velocityX) > velocity_threshold) {
//                                        if (xDiff > 0){
//                                            /// right
//                                            Intent intent = new Intent(MainActivity.this,Practical1.class );
//                                            startActivity(intent);
//                                        }else{
//                                            ///left
//                                        }
//                                        return true;
//                                    }
//                                    }
//                                else {
//                                    if (Math.abs(yDiff) > threshold
//                                               && Math.abs(velocityY) > velocity_threshold){
//                                        if(yDiff > 0){
//                                            ///down
//                                        }else {
//                                            //up
//                                        }
//                                        return false ;
//
//                                    }
//                                }
//                            }catch (Exception e){
//                                e.printStackTrace();
//                            }
//                            return false;
//                        };
//                };
//            gestureDetector = new GestureDetector(listener);
//
//            view.setOnTouchListener(this);
//        }
//        @Override
//        public boolean onTouch(View v, MotionEvent motionEvent) {
//            return gestureDetector.onTouchEvent(motionEvent);
//        }
//    }
}