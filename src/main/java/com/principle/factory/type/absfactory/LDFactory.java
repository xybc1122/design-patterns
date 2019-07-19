package com.principle.factory.type.absfactory;

import com.principle.factory.type.pizza.LDCheessPizza;
import com.principle.factory.type.pizza.LDPepperPizza;
import com.principle.factory.type.pizza.Pizza;

/**
 * @ClassName BJFactory
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:22
 **/
public class LDFactory implements AbsFactory {


    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new LDCheessPizza();
        } else if (orderType.equals("cheese")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }


}
