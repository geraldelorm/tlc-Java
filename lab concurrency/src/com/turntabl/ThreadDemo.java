package com.turntabl;

public class ThreadDemo extends Thread {
    public void run() {
        int count = 0;
        while (!Thread.interrupted()){
            try{
                count++;
                Thread.sleep(1000);
            } catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            System.out.println(count);
        }
    }
}
