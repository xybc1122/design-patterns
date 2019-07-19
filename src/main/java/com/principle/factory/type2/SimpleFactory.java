package com.principle.factory.type2;


import com.principle.factory.type1.Pizza;


/**
 * @ClassName SimpleFactory
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 11:10
 * 简单工厂类
 **/
public class SimpleFactory {

    public static void main(String[] args) {
        new OrderPizza(new SimpleFactory()).produce("cheese");
    }


    public Pizza createPizza(String orderType) {
        System.out.println("使用简单工厂模式");
        Pizza pizza = null;
        if (orderType.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName(orderType);
        } else if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName(orderType);
        }
        return pizza;
    }

}


class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨 准备原材料");
    }
}


class GreekPizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("给希腊披萨 准备原材料");
    }
}


class OrderPizza {

    private SimpleFactory simpleFactory;

    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);

    }

    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
    }

    public void produce(String type) {
        Pizza pizza = this.simpleFactory.createPizza(type);
        if (pizza != null) {
            pizza.prepare();
            pizza.back();
            pizza.cut();
            pizza.box();
        } else {
            System.out.println("工厂is null");
        }

    }
}

