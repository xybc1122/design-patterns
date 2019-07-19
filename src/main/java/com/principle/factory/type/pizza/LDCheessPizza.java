package com.principle.factory.type.pizza;

/**
 * @ClassName BJCheessPizza
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:18
 **/
public class LDCheessPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦奶酪");

        System.out.println("给伦敦奶酪披萨 准备原材料");
    }
}
