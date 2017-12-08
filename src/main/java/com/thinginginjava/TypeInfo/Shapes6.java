package com.thinginginjava.TypeInfo;

import java.util.Arrays;
import java.util.List;

// typeinfo/Shapes6.java
// TIJ4 Chapter Typeinfo, Exercise 6, page 318
/*
* 修改Shapes.java，使这个程序能将某个特定类型的所有形状都"标示"出来（通过设标志）。
* 每一个导出的Shape类的toString() 方法应该能够指出Shape是否被标示。
*/
public class Shapes6 {
  public static void setFlag(Shape s) {
    if(s instanceof Triangle6)
      ((Triangle6)s).flag = true;
  }

  public static void main(String[] args){
    List<Shape> shapeList = Arrays.asList(
        new Circle6(), new Square6(), new Triangle6()
    );

    for(Shape shape:shapeList){
      setFlag(shape);
      System.out.println(shape);
    }
  }
}

class Circle6 extends Shape {
  boolean flag = false;
  public String toString() {
    return (flag ? "H" : "Unh") + "ighlighted " + "Circle";
  }
}

class Square6 extends Shape {
  boolean flag = false;
  public String toString() {
    return (flag ? "H" : "Unh") + "ighlighted " + "Square";
  }
}

class Triangle6  extends Shape {
  boolean flag = false;
  public String toString() {
    return (flag ? "H" : "Unh") + "ighlighted " + "Triangle";
  }
}
