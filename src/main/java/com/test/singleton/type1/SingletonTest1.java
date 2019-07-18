package com.test.singleton.type1;

//饿汉式(静态变量)
public class SingletonTest1 {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }

}

class Singleton {

    private final static Singleton ourInstance = new Singleton();

    public static Singleton getInstance() {

        return ourInstance;
    }

    private Singleton() {
    }


}