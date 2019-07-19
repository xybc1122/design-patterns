package com.principle.factory.type.absfactory;

import com.principle.factory.type.pizza.Pizza;

/**
 * @ClassName AbsFactory
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/19 14:21
 * 抽象工厂模式 设计
 **/
public interface AbsFactory {
    //创建披萨
    Pizza createPizza(String type);
}
