package com.test.singleton.type2;

//饿汉式 2(静态代码块执行)
public class SingletonTest2 {
    public static void main(String[] args) {

        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }

}

class Singleton {

    private static Singleton ourInstance;


    static {
        ourInstance = new Singleton();
    }

    public static Singleton getInstance() {

        return ourInstance;
    }

    private Singleton() {
    }


}