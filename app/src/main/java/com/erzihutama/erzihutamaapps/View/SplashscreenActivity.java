package com.erzihutama.erzihutamaapps.View;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.erzihutama.erzihutamaapps.R;

public class SplashscreenActivity extends AppCompatActivity {
    private int waktu_loading=2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent home=new Intent(SplashscreenActivity.this, IntroActivity.class);
                startActivity(home);
                finish();

            }
        },waktu_loading);

    }
}
