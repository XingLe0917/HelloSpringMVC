// interfaces/Ex4.java
// TIJ4 Chapter Interfaces, Exercise 4, page 172
/* 创建一个不包括任何方法的抽象类，从它那里导出一个类，并添加一个方法。
 * 创建一个静态方法，它可以接受指向基类的引用，将其向下转型到导出类，然后再调用该静态方法。
 * 在main()中，展现它的运行情况。然后，为基类中的方法加上 abstract 声明，这样就不再需要进行向下转型。
*/ 
package com.thinginginjava.interfaces;

//创建一个不包括任何方法的抽象类
abstract class Dad1 {}

//从它那里导出一个类，并添加一个方法
class Son1 extends Dad1 {
	protected void print() { System.out.println("Son1"); }
}

abstract class SecondDad {
	abstract protected void print();
}

class SecondSon extends SecondDad {
	@Override
	protected void print() {
		System.out.println("SecondSon");
	}
}

public class Ex4 {
	//创建一个静态方法，它可以接受指向基类的引用
	public static void testPrint(Dad1 d) {
		((Son1)d).print();
	}
	public static void secondTestPrint(SecondDad sd){
		sd.print();
	}
	public static void main(String[] args){
		Son1 s = new Son1();
		Ex4.testPrint(s);
		SecondSon ss = new SecondSon();
		Ex4.secondTestPrint(ss);
	}
}
