package com.mianshi.suanfa.singleton;

/**
 * Created by macbook_xu on 2018/3/16.
 */
public class MySingleton {//饿汉单例模式
    private static MySingleton instance = new MySingleton();

    private MySingleton(){}

    public static MySingleton getInstance(){
        return instance;
    }
}
