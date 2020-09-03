package com.example.coronat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AppTestFinalActivity extends AppCompatActivity {
    TextView Percent ;
    TextView Name;
    String UserName = Global.UserName;
    int illPercent = Global.Percent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_test_final);
        Percent = findViewById(R.id.tv3_apptest_final);
        Name = findViewById(R.id.tv1_apptest_final);
        Percent.setText(illPercent+"%");
        Name.setText(UserName+" عزیز!");
    }

    public void btnAppTestFinalOnClick(View view) {
        finish();
    }
}
