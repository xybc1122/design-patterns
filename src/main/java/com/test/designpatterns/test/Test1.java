package com.test.designpatterns.test;

/**
 * @ClassName Test1
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/17 11:31
 * 单一职责设计
 **/
public class Test1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.runVehicle("汽车");
        vehicle.runVehicle("摩托车");
        vehicle.runAir("飞机");
        vehicle.runWater("船");
    }


}

// TODO 类没有遵守单一职责,但是方法是遵守的 仍是遵守单一职责
class Vehicle {

    public void runVehicle(String vehicle) {
        System.out.println(vehicle + "在公路上跑");

    }

    public void runAir(String vehicle) {
        System.out.println(vehicle + "天空上跑");

    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水上跑");

    }


}