package com.thinginginjava.TypeInfo;
//TypeInfo/Shapes3.java
// TIJ4 Chapter Typeinfo, Exercise 3, page 318

import java.util.Arrays;
import java.util.List;

/**
 * 添加Rhomboid 到Shapes.java中。
 * 创建一个添加Rhomboid，将其向上转型为Shape，然后向下转型回Rhomboid。
 * 试着将其向下转型成Circle，看看会发生什么。
 */
public class Shapes3 {
  public static void main(String[] args) {
    // upcasting to Shape:
    List<Shape> shapeList = Arrays.asList(
        new Circle(), new Square(), new Triangle(), new Rhomboid()
    );
    // downcasting back to specific shape:
    for(Shape shape : shapeList)
      shape.draw();
    System.out.println("----------");
    Rhomboid r = new Rhomboid();
    Shape s = (Shape) r;
    s.draw();
    // inconvertible types: 不能转换类型
//     ((Circle)r).draw();

    //Exercise 4, page 318 修改Exercise 3 ，让你的程序在执行向下转型之前先运用instanceof检查类型
    // check type before downcast:
    if(s instanceof Circle)
      ((Circle)s).draw();
    else if(!(s instanceof Circle))
      System.out.println("(Shape)r is not a Circle");
  }
}


abstract class Shape {
  void draw() { System.out.println(this + ".draw()"); }
  abstract public String toString();
}

class Circle extends Shape {
  public String toString() { return "Circle"; }
}

class Square extends Shape {
  public String toString() { return "Square"; }
}

class Triangle extends Shape {
  public String toString() { return "Triangle"; }
}

class Rhomboid extends Shape {
  public String toString() { return "Rhomboid"; }
}