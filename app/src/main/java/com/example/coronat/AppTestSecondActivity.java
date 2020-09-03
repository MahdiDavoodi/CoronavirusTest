package com.example.coronat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class AppTestSecondActivity extends AppCompatActivity {
    TextView ShowQuestion;
    int illPercent;
    int QuestionNumber = 1;
    TextView ShowQuestionNumber;
    int SetText = 0;
    int[] QuestionArray = {
            R.string.question_1_apptest,
            R.string.question_2_apptest,
            R.string.question_3_apptest,
            R.string.question_4_apptest,
            R.string.question_5_apptest,
            R.string.question_6_apptest,
            R.string.question_7_apptest,
            R.string.question_8_apptest,
            R.string.question_9_apptest,
            R.string.question_10_apptest,
            R.string.question_11_apptest,
            R.string.question_12_apptest,
            R.string.question_13_apptest,
            R.string.question_14_apptest,
            R.string.question_15_apptest,
            R.string.question_16_apptest,
            R.string.question_17_apptest,
            R.string.question_18_apptest,
            R.string.question_19_apptest,
            R.string.question_20_apptest,};
    int[] QuestionPercent = {2, 3, 4, 3, 5, 5, 1, 5, 3, 3, 1, 4, 3, 1, 2, 4, 7, 10, 7, 7};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_test_second);
        ShowQuestion = findViewById(R.id.tv_apptest_main2);
        ShowQuestionNumber = findViewById(R.id.tv_apptest_main3);
        ShowQuestion.setText(QuestionArray[SetText]);
        ShowQuestionNumber.setText(QuestionNumber+"/20");
    }

    public void YesAppTestOnClick(View view) {
        if (SetText <= 18) {
            illPercent = illPercent + QuestionPercent[SetText];
            SetText++;
            QuestionNumber++;
            ShowQuestionNumber.setText(QuestionNumber+"/20");
            ShowQuestion.setText(QuestionArray[SetText]);
        } else {
            Global.Percent = illPercent;
            Intent intent = new Intent(AppTestSecondActivity.this, AppTestFinalActivity.class);
            startActivity(intent);
            finish();
        }

    }

    public void NoAppTestOnClick(View view) {
        if (SetText <= 18) {
            SetText++;
            QuestionNumber++;
            ShowQuestionNumber.setText(QuestionNumber+"/20");
            ShowQuestion.setText(QuestionArray[SetText]);
        } else {
            Global.Percent = illPercent;
            Intent intent = new Intent(AppTestSecondActivity.this, AppTestFinalActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
