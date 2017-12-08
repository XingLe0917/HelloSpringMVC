package com.thinginginjava.TypeInfo;
// typeinfo/Shapes5.java
// TIJ4 Chapter Typeinfo, Exercise 5, page 318
/* Implement a rotate(Shape) method in Shapes.java, such that it checks
* to see if it is rotating a Circle (and, if so, doesn't perform the
* operation).
* 实现Shapes.java中的rotate(Shape)方法，让它能判断它所旋转的是不是Circle（如果是，就不执行）
*/
import java.util.Arrays;
import java.util.List;

public class Shapes5 {

  public static void rotate(Shape s){
    if(!(s instanceof Circle)){
      System.out.println(s+" rotate");
    }
  }

  public static void main(String[] args){
    List<Shape> shapeList = Arrays.asList(
        new Circle(), new Square(), new Triangle(), new Rhomboid()
    );

    for(Shape s :shapeList)
      s.draw();
    System.out.println("---------------");
    for (Shape s:shapeList)
      rotate(s);
  }
}
