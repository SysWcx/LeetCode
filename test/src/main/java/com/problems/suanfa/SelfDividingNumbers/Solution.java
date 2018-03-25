package com.mianshi.suanfa.SelfDividingNumbers;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by macbook_xu on 2018/3/24.
 */
public class Solution {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new LinkedList<Integer>();

        for (int i = left ; i <= right ; i++){
            if (String.valueOf(i).length()==1){
                list.add(i);
            }else if (String.valueOf(i).length()==2 && i%10!=0){
                if (i%(i/10)==0 && i%(i%10)==0){
                    list.add(i);
                }
            }else if (String.valueOf(i).length()==3 && i%10!=0 && i%100>10){
                if (i%(i/100)==0 && i%((i%100)/10)==0 && i%(i%10)==0){
                    list.add(i);
                }
            }else if (String.valueOf(i).length()==4 && i%10!=0 && i%100>10 && i%1000>100){
                if (i%(i/1000)==0 && i%((i%1000)/100)==0 && i%((i%100)/10)==0 && i%(i%10)==0){
                    list.add(i);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println(selfDividingNumbers(1,9999));
    }
}
