package com.mianshi.suanfa.HammingDistance;

/**
 * Created by macbook_xu on 2018/3/20.
 */
public class test {

    public static int hammingDistance(int a,int b){
        int c = Integer.bitCount(5);
        return c;

    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}
