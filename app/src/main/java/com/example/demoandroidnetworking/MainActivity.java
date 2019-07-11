package com.example.demoandroidnetworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyThread th1 = new MyThread();
        th1.setName("Tien trình 1");
        th1.start(); // kích hoạt tiến trình (gọi là tiểu trình)

        MyThread th2 = new MyThread();
        th2.setName("Tien trinh 2");
        th2.start();
    }
}

