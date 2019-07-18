package com.test.singleton.type3;

//懒汉式 (双重检查)
public class SingletonTest3 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "-----" + Singleton.getInstance());
            }

        }).start();
    }

}

class Singleton {

    private static volatile Singleton ourInstance;

    private Singleton() {
    }


    public static Singleton getInstance() {
        if (ourInstance == null) {
            synchronized (Singleton.class) {
                if (ourInstance == null) {
                    ourInstance = new Singleton();
                }
            }
        }
        return ourInstance;
    }
}