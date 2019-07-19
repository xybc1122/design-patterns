package com.principle.inversion.test;

/**
 * @ClassName Test1
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/17 14:27
 * 依赖倒转
 **/
public class Test1 {

    public static void main(String[] args) {
        Person p = new Person();
        p.receive(new Wchat());
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

class Person {

    public void receive(Inversion i) {
        System.out.println(i.receive());
    }
}
