// interfaces/RodentEx1.java
// TIJ4 Chapter Interfaces, Exercise 1, page 171
/* 修改第8章练习9中的 Rodent，使其成为一个抽象类。
 * 只要有可能，就将Rodent的方法声明为抽象方法。
*/
package com.thinginginjava.interfaces;

abstract class Rodent {
	private String name = "Rodent";
	abstract protected void eat();
	abstract protected void run();
	abstract protected void sleep();
	abstract public String toString();
}

class Mouse extends Rodent {
	private String name = "Mouse";
	protected void eat() { System.out.println("Mouse.eat()"); }
	protected void run() { System.out.println("Mouse.run()"); }
	protected void sleep() { System.out.println("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Gerbil extends Rodent {
	private String name = "Gerbil";
	protected void eat() { System.out.println("Gerbil.eat()"); }
	protected void run() { System.out.println("Gerbil.run()"); }
	protected void sleep() { System.out.println("Gerbil.sleep()"); }
	public String toString() { return name; }
}

class Hamster extends Rodent {
	private String name = "Hamster";
	protected void eat() { System.out.println("Hamster.eat()"); }
	protected void run() { System.out.println("Hamster.run()"); }
	protected void sleep() { System.out.println("Hamster.sleep()"); }
	public String toString() { return name; }
}
public class RodentEx1 {
	static RandomRodentGenerator1 gen = new RandomRodentGenerator1();
	public static void main(String[] args){
		// Error: cannot instantiate abstract class:
		// Rodent x = new Rodent();
		// But OK to create array to be downcast to derived objects:
		Rodent[] rodents = new Rodent[3];
		for(Rodent r:rodents){
			r = gen.next();
			System.out.println(r + ":");
			r.eat();
			r.run();
			r.sleep();
		}
	}

}
