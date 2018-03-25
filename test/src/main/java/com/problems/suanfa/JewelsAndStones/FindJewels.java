package com.mianshi.suanfa.JewelsAndStones;

/**
 * Created by macbook_xu on 2018/3/19.
 */
public class FindJewels {
    public static int findJewels(String j,String s){
        int num = 0;
        for (char newS : s.toCharArray()){
            for (char newJ : j.toCharArray()){
                if (newS==newJ)
                    num++;
            }
        }
        return num;
    }

    public static int numJewelsInStones(String J, String S) {
        return S.replaceAll("[^" + J + "]", "").length();
    }

    public static void main(String[] args) {
        System.out.println(findJewels("z","ZZZZaaa"));
        System.out.print(numJewelsInStones("aA","aAAbbbbb"));

    }
}
