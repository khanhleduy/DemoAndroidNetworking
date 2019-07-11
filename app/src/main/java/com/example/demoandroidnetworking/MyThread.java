package com.example.demoandroidnetworking;

public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();

        for(int i=0;i<5;i++){
            //Thread.currentThread().getName() return về tiến trình đang
            System.out.println(Thread.currentThread().getName()+" i = " + i);
        }
    }
}
