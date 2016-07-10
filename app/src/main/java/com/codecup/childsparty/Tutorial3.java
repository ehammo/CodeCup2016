package com.codecup.childsparty;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Tutorial3 extends AppCompatActivity {

    private final long SPLASH_DISPLAY_LENGTH = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Tutorial3.this, MainActivity.class));
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);

    }
}
