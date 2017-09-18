package com.thinginginjava.Polymorphism;

//polymorphism/Shapes.java
//TIJ4 Chapter Polymorphism, Exercise 2,Exercise 3, page 153
//Exercise 2,在几何图形的示例中添加@Override注解。

//Exercise 3,在基类Shape.java中添加一个新方法，用于打印一条消息，但导出类中不要覆盖整个方法。请解释发生了什么。
//现在，在其中一个导出类中覆盖整个方法，而在其他的导出类中不予覆盖，观察又有什么发生。最后，在所有的导出类中覆盖整个方法。
public class Shapes {
	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args){
		Shape[] s = new Shape[9];
		for(int i = 0;i<s.length;i++)
			s[i] = gen.next();
		for(Shape shp : s){
			shp.draw();
			shp.amend();
		}
	}

}
