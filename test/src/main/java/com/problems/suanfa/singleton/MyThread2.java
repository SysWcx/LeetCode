package com.mianshi.suanfa.singleton;

/**
 * Created by macbook_xu on 2018/3/16.
 */
public class MyThread2 extends Thread {
    @Override
    public void run(){
        System.out.println(MySingleton2.getInstance().hashCode());
    }

    public static void main(String[] args) {
        MyThread2[] mts = new MyThread2[10];
        for (int i = 0 ;i<mts.length ; i++){
            mts[i] = new MyThread2();
        }

        for (int j = 0 ; j<mts.length ; j++){
            mts[j].start();
        }
    }
}
