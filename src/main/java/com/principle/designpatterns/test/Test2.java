package com.principle.designpatterns.test;

/**
 * @ClassName Test2
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/17 12:41
 * 单一职责设计
 **/
public class Test2 {


}

// TODO 类的单一职责设计
class t1 {
     public void runT1(){
         System.out.println("飞机在天上飞");
     }
}

class t2 {
    public void runT2(){
        System.out.println("火车在地上开");
    }
}

class t3 {
    public void runT3(){
        System.out.println("轮船在水里开");
    }
}