package com.principle.factory.type.pizza;

/**
 * @ClassName BJCheessPizza
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:18
 **/
public class BJPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("北京希腊");
        System.out.println("给北京希腊披萨 准备原材料");
    }
}
