// polymorphism/RodentEx9.java
// TIJ4 Chapter Polymorphism, Exercise 9, page 155
/* 创建Rodent（锯齿动物）：Mouse(老鼠)，Gerbil(沙鼠)，Hamster(仓鼠)，等等这样一个继承层次结构。
 * 在基类中，提供所有的Rodent都通用的方法，在导出类中，根据特定的Rodent类型覆盖这些方法，以便它们执行不同的行为。
 * 创建一个Rodent数组，填充不同的Rodent类型，然后调用基类方法，观察发生什么情况。
*/
package com.thinginginjava.Polymorphism;

class Rodent {
	private String name = "Rodent";
	protected void eat() { System.out.println("Rodent.eat()"); }
	protected void run() { System.out.println("Rodent.run()"); }
	protected void sleep() { System.out.println("Rodent.sleep()"); }
	public String toString() { return name; }
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

public class RodentEx9 {
	private static RandomRodentGenerator gen = new RandomRodentGenerator();

	public static void main(String[] args) {
		Rodent[] rodents = new Rodent[3];
		for (Rodent r : rodents) {
			r = gen.next();
			System.out.println(r + ": ");
			r.eat();
			r.run();
			r.sleep();
		}
	}

}
