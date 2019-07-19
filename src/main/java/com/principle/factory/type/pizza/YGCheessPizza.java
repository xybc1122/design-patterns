package com.principle.factory.type.pizza;

/**
 * @ClassName BJCheessPizza
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:18
 * 披萨准备类
 **/
public class YGCheessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("英国奶酪");
        System.out.println("给英国奶酪披萨 准备原材料");
    }
}
