package com.example.coronat;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.tabs.TabLayout;

import androidx.core.view.ViewCompat;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.coronat.ui.main.SectionsPagerAdapter;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this, LoadingActivity.class);
        startActivity(intent);
        viewPager = findViewById(R.id.view_pager);
        SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(this, getSupportFragmentManager());
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPager.setAdapter(sectionsPagerAdapter);
        TabLayout tabs = findViewById(R.id.tabs);
        tabs.setupWithViewPager(viewPager);
        Snackbar snackbar = Snackbar.make(viewPager, "جهت تغییر صفحه، انگشت خود را به چپ یا راست بکشید!", Snackbar.LENGTH_LONG);
        ViewCompat.setLayoutDirection(snackbar.getView(),ViewCompat.LAYOUT_DIRECTION_RTL);
        snackbar.show();
        //viewPager.setRotationY(180);                                                                                        // baraye taghire jahate charkheshe view pager


    }


    public void AppTestOnClickMain(View view) {
        Intent intent = new Intent(MainActivity.this, AppTestActivity.class);
        startActivity(intent);
    }

    public void GoogleTestOnClickMain(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://test.corona.ir/"));
        startActivity(intent);
        Toast.makeText(this, "سامانه آموزش آنلاین", Toast.LENGTH_LONG).show();
    }

    public void btnOnClickAboutvirus(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://fa.wikipedia.org/wiki/%DA%A9%D8%B1%D9%88%D9%86%D8%A7%D9%88%DB%8C%D8%B1%D9%88%D8%B3#%DA%A9%D8%B1%D9%88%D9%86%D8%A7%DB%8C_%D8%AC%D8%AF%DB%8C%D8%AF_(%DA%A9%D9%88%D9%88%DB%8C%D8%AF_%DB%B1%DB%B9)_2019-nCoV"));
        startActivity(intent);
        Toast.makeText(this, "ویکی پدیا فارسی", Toast.LENGTH_LONG).show();
    }

    public void btnHomeOnClick(View view) {
        Intent intent = new Intent(MainActivity.this, GoodSrcActivity.class);
        startActivity(intent);
    }

    public void btnAmarOnClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.worldometers.info/coronavirus/country/iran/"));
        startActivity(intent);
        Toast.makeText(this, "World O Meters English", Toast.LENGTH_LONG).show();
    }
}
//Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)