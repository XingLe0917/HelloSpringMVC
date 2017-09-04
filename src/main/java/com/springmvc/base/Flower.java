package com.springmvc.base;

//5.4 在构造器中调用构造器
public class Flower {
	private int petalCount = 0;
	private String s = new String("null");

	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount= "
				+ petalCount);
	}

	Flower(String ss) {
		System.out.println("Constructor w/ String arg only, s=" + ss);
		s = ss;
	}

	//尽管可以用this 调用一个构造器，但不能调用2个，必须将构造器置于最起始处，否则编译器会报错
	Flower(String s, int petals) {
		this(petals);
		// ! this(s); // Can't call two!
		this.s = s; // Another use of "this"
		System.out.println("String & int args");
	}

	Flower() {
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}

	void print() {
		// ! this(11); // Not inside non-constructor!
		//除构造器外，编译器禁止在其他任何方法中调用调用构造器 用this的话,new Flower(11);
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}

	public static void main(String[] args) {
		Flower x = new Flower();
		x.print();
	}
}
