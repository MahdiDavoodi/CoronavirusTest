package com.example.coronat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AppTestActivity extends AppCompatActivity {
    public static String UserName;
    int UserAge;
    EditText InputUserName;
    EditText InputUserAge;
    int nextTab = 0;

    protected void onCreate(Bundle savedInstanceState) {                                                                    //bekhatere public static @override ro bayad br midashtm
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_test);
        InputUserName = findViewById(R.id.et_apptest_main);
        InputUserAge = findViewById(R.id.et2_apptest_main);

    }

    public void checkTheEmty() {
        String CheckName = InputUserName.getText().toString().trim();
        String CheckAge = (InputUserAge.getText().toString().trim());
        if (CheckName.equals("")) {
            InputUserName.setHintTextColor(Color.RED);
            nextTab = 1;

        } else {
            UserName = InputUserName.getText().toString().trim();
            Global.UserName = UserName;
            nextTab = 0;
        }
        if (CheckAge.equals("")) {
            if (nextTab == 1) {
                Toast.makeText(this, "نام و سن خود را وارد کنید!", Toast.LENGTH_SHORT).show();
                InputUserAge.setHintTextColor(Color.RED);
                nextTab = 3;
            } else {
                Toast.makeText(this, "سن خود را وارد کنید!", Toast.LENGTH_SHORT).show();
                InputUserAge.setHintTextColor(Color.RED);
                nextTab = 2;
            }
        } else {
            if (nextTab == 0) {
                UserAge = Integer.parseInt((InputUserAge.getText().toString().trim()));
            }

        }
        if (nextTab == 1) {
            Toast.makeText(this, "نام خود را وارد کنید!", Toast.LENGTH_SHORT).show();
        }
    }

    public void startAppTestonClick(View view) {
        checkTheEmty();
        if (nextTab == 0) {
            Intent intent = new Intent(AppTestActivity.this, AppTestSecondActivity.class);
            startActivity(intent);
            finish();
        }
    }

    public void exitAppTestonClick(View view) {
        finish();
    }
}
