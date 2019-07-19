package com.principle.factory.type.order;
import com.principle.factory.type.absfactory.YGFactory;

/**
 * @ClassName OrderStore
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:32
 **/
public class OrderStore {

    public static void main(String[] args) {
        new OrderPizza(new YGFactory()).getPizza("cheese");

    }
}
