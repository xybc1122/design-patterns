package com.principle.factory.type.pizza;

/**
 * @ClassName Pizza
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:16
 **/
public abstract class Pizza {
    private String name;

    //准备原材料制作披萨方法
    public abstract void prepare();

    //烘烤
    public void back() {
        System.out.println(name + "开始烘烤披萨");
    }

    //切割
    public void cut() {
        System.out.println(name + " 开始切割披萨");
    }

    //打包
    public void box() {
        System.out.println(name + " 开始打包披萨");

    }

    public void success() {
        System.out.println(name + " 完成");

    }

    public void setName(String name) {
        this.name = name;
    }
}
