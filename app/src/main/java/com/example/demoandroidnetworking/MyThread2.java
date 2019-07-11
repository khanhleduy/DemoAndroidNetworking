package com.example.demoandroidnetworking;

public class MyThread2 implements Runnable {// đối tượng MyThread2 có thể chạy trong 1 luồng riêng vì thực thi giao diện Runnable.
    String thrdName;

    MyThread2(String name){
        thrdName = name;
    }

    // Điểm khởi đầu của luồng.
    @Override
    public void run() {
        System.out.println(thrdName + "Bắt đầu chạy.");
        try{
            for(int count = 0; count < 10; count++){
                Thread.sleep(400);
                System.out.println(thrdName + ", đang đếm đến " + count);
            }
        } catch (InterruptedException e) {
            System.out.println(thrdName + "bị ngắn.");
            e.printStackTrace();
        }
        System.out.println(thrdName + "kết thúc.");
    }
}

class UseThreads{
    public static void main(String args[]){
        System.out.println("Luồng chính bắt đầu chạy.");

        // Đầu tiến khởi tạo một đối tượng MyThread.
        MyThread2 mt = new MyThread2("Luồng con #1");

        // Tiếp theo, khởi tạo một luồng từ đối tượng trên.
        Thread newThrd = new Thread(mt);

        // Cuối cùng, khởi chạy đối tượng.
        newThrd.start();

        for (int i = 0; i < 50; i++){
            System.out.print(">");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Luồng chính đã bị ngắt.");
                e.printStackTrace();
            }
        }
        System.out.println(" Luồng chính kết thúc.");
    }
}
