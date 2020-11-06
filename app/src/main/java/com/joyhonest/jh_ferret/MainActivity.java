package com.joyhonest.jh_ferret;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.joyhonest.ferrent_new_android.MyApp;
import com.joyhonest.ferrent_new_android.SplashActivity;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_Start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MyApp.F_GotoPlayActivity(MainActivity.this, SplashActivity.class);
            }
        });
    }
}