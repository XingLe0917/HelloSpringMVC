// polymorphism/Ex10.java
// TIJ4 Chapter Polymorphism, Exercise 10, page 155
/* 创建一个包含两个方法的基类。
 * 在第一个方法中可以调用第二个方法。
 * 然后产生一个继承自该基类的导出类，且覆盖基类中的第二个方法。
 * 为该导出类创建一个对象，将它向上转型到基类型并调用第一个方法，解释发生的情况。
*/
package com.thinginginjava.Polymorphism;

class A {
	protected void f() {
		System.out.println("A.f()");
		this.g();
	}
	
	protected void g() { System.out.println("A.g()");}
}

class B extends A {
	@Override
	protected void g() { System.out.println("B.g()");}
}
public class Ex10 {
	public static void main(String[] args){
		B b = new B();
		// automatic upgrade to base-class to call base-class method A.f()
		// which,by polymorphism, will call the derived-class method B.g():
		b.f();
	}
	
}
