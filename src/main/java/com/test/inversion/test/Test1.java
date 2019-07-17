package com.test.inversion.test;

/**
 * @ClassName Test1
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/17 14:27
 **/
public class Test1 {

    public static void main(String[] args) {
        Position p = new Position();
        System.out.println(p.receive(new Email()));
        System.out.println(p.receive(new Wchat()));
    }


}

class Wchat implements Inversion {

    @Override
    public String receive() {
        return "微信消息: Hello WX";
    }
}

class Email implements Inversion {

    @Override
    public String receive() {
        return "电子邮件信息: Hello word";
    }
}

interface Inversion {
    //接收消息
    String receive();
}

abstract class Person {

    public abstract String receive(Inversion i);
}

class Position extends Person {

    @Override
    public String receive(Inversion i) {
        return i.receive();
    }
}