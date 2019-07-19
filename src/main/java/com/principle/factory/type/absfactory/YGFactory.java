package com.principle.factory.type.absfactory;

import com.principle.factory.type.pizza.Pizza;
import com.principle.factory.type.pizza.YGCheessPizza;
import com.principle.factory.type.pizza.YGPepperPizza;

/**
 * @ClassName YGFactory
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:37
 **/
public class YGFactory implements AbsFactory {


    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new YGCheessPizza();
        } else if (orderType.equals("cheese")) {
            pizza = new YGPepperPizza();
        }
        return pizza;
    }
}
