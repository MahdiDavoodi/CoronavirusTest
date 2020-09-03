package com.example.coronat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);
        new Thread(new Runnable() {
            @Override
            public void run() {
                onBack();
            }
        }).start();
        //Toast.makeText(this, "جهت تغییر صفحه، انگشت خود را به چپ یا راست بکشید", Toast.LENGTH_LONG).show();
    }

    public void onBack() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finish();
    }
}
