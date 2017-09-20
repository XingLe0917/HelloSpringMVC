// polymorphism/RodentEx12.java
// TIJ4 Chapter Polymorphism, Exercise 12, page 161
/* 修改练习9，使其能够演示基类和导出类的初始化顺序。
 * 然后向基类和导出类中添加成员对象，并说明构建期间初始化的顺序。 
*/
package com.thinginginjava.Polymorphism;

class Characteristic {
	private String s;
	Characteristic(String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}
}

class Description {
	private String s;
	Description(String s) {
		this.s = s;
		System.out.println("Creating Description " + s);
	}
}

class Rodent1 {
	private String name = "Rodent";
	private Characteristic c = new Characteristic("has tail");
	private Description d = new Description("small mammal");
	Rodent1() { System.out.println("Rodent()"); }
	protected void eat() { System.out.println("Rodent.eat()"); }
	protected void run() { System.out.println("Rodent.run()"); }
	protected void sleep() { System.out.println("Rodent.sleep()"); }
	public String toString() { return name; }
}

class Mouse1 extends Rodent1 {
	private String name = "Mouse";
	private Characteristic c = new Characteristic("likes cheese");
	private Description d = new Description("nocturnal");
	Mouse1() { System.out.println("Mouse()"); }
	protected void eat() { System.out.println("Mouse.eat()"); }
	protected void run() { System.out.println("Mouse.run()"); }
	protected void sleep() { System.out.println("Mouse.sleep()"); }
	public String toString() { return name; }
}

class Rat1 extends Rodent1 {
	private String name = "Rat";
	private Characteristic c = new Characteristic("larger");
	private Description d = new Description("black");
	Rat1() { System.out.println("Rat()"); }
	protected void eat() { System.out.println("Rat.eat()"); }
	protected void run() { System.out.println("Rat.run()"); }
	protected void sleep() { System.out.println("Rat.sleep()"); }
	public String toString() { return name; }
}

class Squirrel1 extends Rodent1 {
	private String name = "Squirrel";
	private Characteristic c = new Characteristic("climbs trees");
	private Description d = new Description("likes nuts");
	Squirrel1() { System.out.println("Squirrel()"); }
	protected void eat() { System.out.println("Squirrel.eat()"); }
	protected void run() { System.out.println("Squirrel.run()"); }
	protected void sleep() { System.out.println("Squirrel.sleep()"); }
	public String toString() { return name; }
}

public class RodentEx12 {
	private static RandomRodentGenerator1 gen = new RandomRodentGenerator1();
	public static void main(String[] args){
		Rodent1[] rodents = new Rodent1[1];
		for(Rodent1 r:rodents){
			r = gen.next();
		}
	}
}
