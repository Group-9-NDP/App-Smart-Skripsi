package com.belajarsimar.appsmartskripsi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        View decorView = getWindow().getDecorView();
        //Hide status bar
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        //Hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}