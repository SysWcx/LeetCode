package com.mianshi.suanfa.JudgeRouteCircle;

/**
 * Created by macbook_xu on 2018/3/21.
 */
public class Solution {
    public static boolean judgeCircle(String moves) {
        int l = 0;
        int r = 0;
        int u = 0;
        int d = 0;

        for (int i=0 ; i<moves.length() ; i++){
            String a = moves.charAt(i)+"";
            if(a.equals("L")){
                l++;
            }else if(a.equals("R")){
                r++;
            }else if(a.equals("U")){
                u++;
            }else if(a.equals("D")){
                d++;
            }else{
                return false;
            }
        }

        if(l==r && u==d){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(judgeCircle("UD"));
        System.out.println((" "+"UUDLRRLUD"+" ").split("U").length);
    }
}
