package com.principle.singleton.type5;

//枚举
public class SingletonTest5 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        instance.sayOK();
    }

}

enum Singleton {
    INSTANCE;//属性

    public void sayOK() {
        System.out.println("ok~");
    }

}