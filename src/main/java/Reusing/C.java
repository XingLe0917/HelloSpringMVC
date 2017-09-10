package Reusing;

//reusing/Ex5/C.java
//TIJ4 Chapter Reusing, Exercise 5, page 120
/* 创建两个带有默认构造器（空参数列表）的类A和类B。
 * 从A中继承产生一个名为C的新类，并在C内创建一个B类的成员。
 * 不要给C编写构造器。
 * 创建一个C类的对象并观察其结果。
 */

class A1 { A1() {System.out.println("A1()");} }

class B1 extends A1 { B1(){ System.out.println("B1()"); } }

public class C extends A1{
	B1 b = new B1();
	public static void main(String[] args){
		C c = new C();
	}
}
