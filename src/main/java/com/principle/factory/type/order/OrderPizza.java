package com.principle.factory.type.order;

import com.principle.factory.type.absfactory.AbsFactory;
import com.principle.factory.type.pizza.Pizza;

/**
 * @ClassName OrderPizza
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:29
 **/
public class OrderPizza {


    //抽象工厂
    private AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        this.absFactory = absFactory;

    }

    //制作披萨接口

    public void getPizza(String type) {
        Pizza pizza = this.absFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.back();
            pizza.box();
            pizza.cut();
            pizza.success();
        } else {
            System.out.println("没有此披萨");
        }

    }


}
