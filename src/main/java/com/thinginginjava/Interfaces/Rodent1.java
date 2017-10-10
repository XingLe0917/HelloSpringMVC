// interfaces/Rodent1.java
// TIJ4 Chapter Interfaces, Exercise 1, page 172
/* 修改第8章练习9中的Rodent,使其成为一个抽象类。
* 只要有可能，就将Rodent的方法声明为抽象方法。
*/
package com.thinginginjava.interfaces;

abstract class Rodent_1 {
	private String name = "Rodent";
	abstract protected void eat(); 
	abstract protected void run();
	abstract protected void sleep();
	abstract public String toString(); 
}

class Mouse_1 extends Rodent_1 {
	private String name = "Mouse";
	protected void eat() { System.out.println("Mouse.eat()"); }
	protected void run() { System.out.println("Mouse.run()"); }
	protected void sleep() { System.out.println("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Rat_1 extends Rodent_1 {
	private String name = "Rat";
	protected void eat() { System.out.println("Rat.eat()"); }
	protected void run() { System.out.println("Rat.run()"); }
	protected void sleep() { System.out.println("Rat.sleep()"); }
	public String toString() { return name; }
}

class Squirrel_1 extends Rodent_1 {
	private String name = "Squirrel";
	protected void eat() { System.out.println("Squirrel.eat()"); }
	protected void run() { System.out.println("Squirrel.run()"); }
	protected void sleep() { System.out.println("Squirrel.sleep()"); }
	public String toString() { return name; }
}

public class Rodent1 {
	private static RandomRodentGenerator gen = new RandomRodentGenerator();
	public static void main(String[] args){
		// Error: cannot instantiate abstract class:
		// Rodent x = new Rodent();
		// But OK to create array to be downcast to derived objects:
		Rodent_1[] rodents = new Rodent_1[3];
		for(Rodent_1 r :rodents){
			r = gen.next();
			System.out.println("r:" +r);
			r.eat();
			r.run();
			r.sleep();
		}
	}
}
