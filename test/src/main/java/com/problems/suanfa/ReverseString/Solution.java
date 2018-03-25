package com.mianshi.suanfa.ReverseString;

/**
 * Created by macbook_xu on 2018/3/22.
 */
public class Solution {
    public static String reverseString(String s) {
        int j = 0;
        String rs = "";
        for (int i=s.length()-1 ; i>=0 ; i--){
            rs += s.charAt(i);
            j++;
        }
        return rs;
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }
}
