package com.example.coronat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class GoodSrcActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_src);
    }

    public void btn1goodsrcOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fa.wikipedia.org/wiki/%DA%A9%D8%B1%D9%88%D9%86%D8%A7%D9%88%DB%8C%D8%B1%D9%88%D8%B3#%DA%A9%D8%B1%D9%88%D9%86%D8%A7%DB%8C_%D8%AC%D8%AF%DB%8C%D8%AF_(%DA%A9%D9%88%D9%88%DB%8C%D8%AF_%DB%B1%DB%B9)_2019-nCoV"));
        startActivity(intent);
        Toast.makeText(this, "ویکی پدیا فارسی", Toast.LENGTH_LONG).show();
    }

    public void btn2goodsrcOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.worldometers.info/coronavirus/country/iran/"));
        startActivity(intent);
        Toast.makeText(this, "World O Meters English", Toast.LENGTH_LONG).show();
    }

    public void btn3goodsrcOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://corona.ir/"));
        startActivity(intent);
        Toast.makeText(this, "سامانه آموزش آنلاین فارسی", Toast.LENGTH_LONG).show();
    }

    public void btn4goodsrcOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.beytoote.com/health/prevention/corona-virus02-prevention.html"));
        startActivity(intent);
        Toast.makeText(this, "بیتوته فارسی", Toast.LENGTH_LONG).show();
    }

    public void btn5goodsrcOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://parstoday.com/dari/news/science-i104978"));
        startActivity(intent);
        Toast.makeText(this, "پارستودی فارسی", Toast.LENGTH_LONG).show();
    }

    public void btn6goodsrcOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://tejaratnews.com/training/%D8%AF%D8%B1%D9%85%D8%A7%D9%86-%D9%88%DB%8C%D8%B1%D9%88%D8%B3-%DA%A9%D8%B1%D9%88%D9%86%D8%A7-%DA%A9%D9%88%D9%88%DB%8C%D8%AF-%E2%80%8D%DB%B1%DB%B9"));
        startActivity(intent);
        Toast.makeText(this, "تجارت نیوز فارسی", Toast.LENGTH_LONG).show();
    }

    public void btn7goodsrcOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.digikala.com/mag/%D8%B9%D9%84%D8%A7%D8%A6%D9%85-%D9%BE%DB%8C%D8%B4%DA%AF%DB%8C%D8%B1%DB%8C-%D8%AF%D8%B1%D9%85%D8%A7%D9%86-%D9%88%DB%8C%D8%B1%D9%88%D8%B3-%DA%A9%D8%B1%D9%88%D9%86%D8%A7-%DA%86%DB%8C%D8%B3%D8%AA/"));
        startActivity(intent);
        Toast.makeText(this, "دیجی کالا فارسی", Toast.LENGTH_LONG).show();
    }
}
