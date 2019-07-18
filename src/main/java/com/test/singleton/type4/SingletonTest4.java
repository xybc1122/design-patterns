package com.test.singleton.type4;

//懒汉式 (静态内部类)
public class SingletonTest4 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName() + "-----" + Singleton.getInstance());
            }

        }).start();
    }

}

class Singleton {

    public static Singleton getInstance() {
        return SingletonInstance.SINGLETON;
    }

    private static class SingletonInstance {
        private static final Singleton SINGLETON;
        static {
            SINGLETON = new Singleton();
        }
    }

    private Singleton() {

    }

}