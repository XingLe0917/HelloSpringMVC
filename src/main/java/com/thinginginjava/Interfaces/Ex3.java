// interfaces/Ex3.java
// TIJ4 Chapter Interfaces, Exercise 3, page 171
/* 创建一个基类，让它包含抽象方法print(),并在导出类中覆盖该方法。
 * 覆盖后的方法版本可以打印导出类中定义的某个整型变量的值。
 * 在定义该变量之处，赋予它非零值。在基类的构造器中调用这个方法。
 * 现在，在main()方法中，创建一个导出类对象，然后调用它print()方法。请解释发生的情形。
*/ 
package com.thinginginjava.interfaces;

abstract class Dad {
	protected abstract void print();
	Dad() { print(); }
}

class Son extends Dad {
	private int i = 1;
	@Override
	protected void print() {
		System.out.println("Son.i = " + i);
	}
}

public class Ex3 {
	public static void main(String[] args) {
		/* Process of initialization:
		* 1. Storage for Son s allocated and initialized to binary zero
		* 2. Dad() called
		* 3. Son.print() called in Dad() (s.i = 0)
		* 4. Member initializers called in order (s.i = 1)
		* 5. Body of Son() called
		*/
		Son s = new Son();
		s.print();
	}
}
