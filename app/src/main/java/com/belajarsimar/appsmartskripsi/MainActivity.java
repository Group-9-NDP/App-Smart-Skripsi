package com.belajarsimar.appsmartskripsi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        //Hide status bar
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        //Hide action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }

    public void register (View view) {
        Intent intent = new Intent(MainActivity.this,RegisterAactivity.class);
        startActivity(intent);
    }

    public void login (View view) {
        Intent intent = new Intent(MainActivity.this,LoginActivity.class);
        startActivity(intent);
    }

}