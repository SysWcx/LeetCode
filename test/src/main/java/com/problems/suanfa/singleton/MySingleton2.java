package com.mianshi.suanfa.singleton;

/**
 * Created by macbook_xu on 2018/3/16.
 */
public class MySingleton2 {//懒汉单例模式
    //private static MySingleton2 instance = null;

    volatile private static MySingleton2 instance = null;

    private MySingleton2(){}

    //使用同步方法效率低
    public static synchronized MySingleton2 getInstance() {
        try {
            if (instance != null) {

            } else {//假设每次创建对象前需要耗时

                Thread.sleep(300);
                synchronized(MySingleton2.class) {
                    if (instance==null) {
                        instance = new MySingleton2();
                    }
                }
            }
            return instance;
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return instance;
    }
}
