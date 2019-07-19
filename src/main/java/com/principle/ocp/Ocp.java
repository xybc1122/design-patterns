package com.principle.ocp;

/**
 * @ClassName Ocp
 * Description TODO
 * @Author 陈恩惠
 * @Date 2019/7/17 16:57
 * 开闭原则
 **/
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
    }


}

abstract class Shape {

    public abstract void draw();

}


class Rectangle extends Shape {


    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}


class Circle extends Shape {


    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class GraphicEditor {


    public void drawShape(Shape s) {
        s.draw();
    }


}
