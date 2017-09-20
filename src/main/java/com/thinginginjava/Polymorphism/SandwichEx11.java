// polymorphism/SandwichEx11.java
// TIJ4 Chapter Polymorphism, Exercise 11, page 159
// 向 Sandwich.java 中添加 Pickle类
package com.thinginginjava.Polymorphism;

class Meal {
	Meal() { System.out.println("Meal()"); } 
}

class Bread {
	Bread() { System.out.println("Bread()"); } 
}

class Cheese {
	Cheese() { System.out.println("Cheese()"); } 
}

class Lettuce {
	Lettuce() { System.out.println("Lettuce()"); } 
}
//新添加Pickle类
class Pickle {
	Pickle() { System.out.println("Pickle()"); }
}

class Lunch extends Meal {
	Lunch() { System.out.println("Lunch()"); } 
}

class PortableLunch extends Lunch {
	PortableLunch() { System.out.println("PortableLunch()"); }
}

public class SandwichEx11 {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Pickle p = new Pickle();
	private Lunch l = new Lunch();
	public SandwichEx11() { System.out.println("Sandwich()"); }
	public static void main(String[] args){
		new SandwichEx11();
	}
}
