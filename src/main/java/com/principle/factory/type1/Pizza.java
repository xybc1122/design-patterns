package com.principle.factory.type1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @ClassName Pizza
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 10:25
 * 非工厂模式  制作披萨流程
 **/
public abstract class Pizza {
    protected String name; //披萨名

    //准备原材料制作披萨方法
    public abstract void prepare();

    //烘烤
    public void back() {
        System.out.println(name + " baking;");
    }

    //切割
    public void cut() {
        System.out.println(name + " cutting;");
    }

    //打包
    public void box() {
        System.out.println(name + " boxing;");

    }


    public void setName(String name) {
        this.name = name;
    }
}

class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给奶酪披萨 准备原材料");
    }
}


class GreekPizza extends Pizza {


    @Override
    public void prepare() {
        System.out.println("给希腊披萨 准备原材料");
    }
}


class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            if (orderType.equals("greek")) {
                pizza = new GreekPizza();
            } else if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
            } else {
                break;
            }
            pizza.setName(orderType);
            pizza.prepare();
            pizza.back();
            pizza.cut();
            pizza.box();
        } while (true);
    }

    private String getType() {
        try {
            BufferedReader strIn = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            return strIn.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }


    }

}

class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza();
    }

}