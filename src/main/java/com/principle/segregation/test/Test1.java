package com.principle.segregation.test;

/**
 * @ClassName Test1
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/17 13:27
 * 接口隔离原则
 **/
public class Test1 {
    public static void main(String[] args) {
        AchieveA achieveA = new AchieveA();
        achieveA.depend1(new AchieveB());//AchieveA类通过接口去依赖(使用) AchieveB
        achieveA.depend2(new AchieveB());
        achieveA.depend3(new AchieveB());
    }

}


interface Interface1 {
    void operation1();
}

interface Interface2 {
    void operation2();

    void operation3();
}

interface Interface3 {
    void operation4();

    void operation5();
}

class AchieveB implements Interface1, Interface2 {


    @Override
    public void operation1() {
        System.out.println("AchieveB 实现了 operation1");
    }

    @Override
    public void operation2() {
        System.out.println("AchieveB 实现了 operation2");
    }

    @Override
    public void operation3() {
        System.out.println("AchieveB 实现了 operation3");
    }
}

class AchieveD implements Interface1, Interface3 {


    @Override
    public void operation1() {
        System.out.println("AchieveD 实现了 operation1");
    }

    @Override
    public void operation4() {
        System.out.println("AchieveD 实现了 operation4");
    }

    @Override
    public void operation5() {
        System.out.println("AchieveD 实现了 operation5");
    }
}

class AchieveA {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface2 i) {
        i.operation2();
    }

    public void depend3(Interface2 i) {
        i.operation3();
    }
}


class AchieveC {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface3 i) {
        i.operation4();
    }

    public void depend3(Interface3 i) {
        i.operation5();
    }
}
