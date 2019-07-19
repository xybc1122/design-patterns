package com.principle.factory.type.pizza;

/**
 * @ClassName BJCheessPizza
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:18
 **/
public class YGPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("英国希腊");
        System.out.println("给英国希腊披萨 准备原材料");
    }
}
