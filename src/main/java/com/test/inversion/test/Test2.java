package com.test.inversion.test;

/**
 * @ClassName Test2
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/17 14:48
 * 依赖倒转
 **/
public class Test2 {

    public static void main(String[] args) {
        OpenAndClose openAndClose = new OpenAndClose();
        TypeTV t = new TypeTV();
        t.setName("黑白");
        openAndClose.open(t);
    }
}

//开关接口 通过接口传递来实现
interface IOpenAndClose {

    void open(ITV itv);

}

//TV接口
interface ITV {
    void play();
}

class OpenAndClose implements IOpenAndClose {
    @Override
    public void open(ITV itv) {
        itv.play();
    }
}

class TypeTV implements ITV {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(this.name + "======>电视打开了");
    }
}
