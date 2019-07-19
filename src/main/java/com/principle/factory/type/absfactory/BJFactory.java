package com.principle.factory.type.absfactory;

import com.principle.factory.type.pizza.BJCheessPizza;
import com.principle.factory.type.pizza.BJPepperPizza;
import com.principle.factory.type.pizza.Pizza;

/**
 * @ClassName BJFactory
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:22
 **/
public class BJFactory implements AbsFactory {


    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new BJCheessPizza();
        } else if (orderType.equals("cheese")) {
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
