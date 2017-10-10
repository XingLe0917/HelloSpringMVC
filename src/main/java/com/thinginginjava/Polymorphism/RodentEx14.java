//// polymorphism/RodentEx14.java
//// TIJ4 Chapter Polymorphism, Exercise 14, page 162
///* 修改练习12，使得其某个成员对象变为具有引用计数的共享对象，并证明它可以正确运行。
//*/
//package com.thinginginjava.Polymorphism;
//class Rodent2 {
//	private String name = "Rodent";
//	
//	private Shared shared;//引用计数的共享对象
//	private static long counter = 0;
//	private final long id = counter++; 
//	
//	private Characteristic c = new Characteristic("has tail");
//	private Description d = new Description("small mammal");
//	Rodent2(Shared shared) { 
//		System.out.println("Rodent() " + id); 
//		this.shared = shared;
//		this.shared.addRef();
//	}
//	protected void eat() { System.out.println("Rodent.eat()"); }
//	protected void run() { System.out.println("Rodent.run()"); }
//	protected void sleep() { System.out.println("Rodent.sleep()"); }
//	public String toString() {  return name + " " + id; }
//}
//
//class Mouse2 extends Rodent2 {
//	Mouse2(Shared shared) {
//		super(shared);
//		System.out.println("Mouse()");	
//	}
//	private String name = "Mouse";
//	private Characteristic c = new Characteristic("likes cheese");
//	private Description d = new Description("nocturnal");
//	protected void eat() { System.out.println("Mouse.eat()"); }
//	protected void run() { System.out.println("Mouse.run()"); }
//	protected void sleep() { System.out.println("Mouse.sleep()"); }
//	public String toString() {return name + ", " + super.toString(); }
//}
//
//class Rat2 extends Rodent2 {
//	Rat2(Shared shared) {
//		super(shared);
//		System.out.println("Rat()");
//	}
//	private String name = "Rat";
//	private Characteristic c = new Characteristic("larger");
//	private Description d = new Description("black");
//	protected void eat() { System.out.println("Rat.eat()"); }
//	protected void run() { System.out.println("Rat.run()"); }
//	protected void sleep() { System.out.println("Rat.sleep()"); }
//	public String toString() { return name + ", " + super.toString(); }
//}
//
//class Squirrel2 extends Rodent2 {
//	Squirrel2(Shared shared) { 
//		super(shared);
//		System.out.println("Squirrel()"); 
//	}
//	private String name = "Squirrel";
//	private Characteristic c = new Characteristic("climbs trees");
//	private Description d = new Description("likes nuts");
//	protected void eat() { System.out.println("Squirrel.eat()"); }
//	protected void run() { System.out.println("Squirrel.run()"); }
//	protected void sleep() { System.out.println("Squirrel.sleep()"); }
//	public String toString() { return name + ", " + super.toString(); }
//}
//
//public class RodentEx14 {
//	private static RandomRodentGenerator2 gen = new RandomRodentGenerator2();
//	public static void main(String[] args){
//		Rodent2[] rodents = new Rodent2[3];
//		for(Rodent2 r:rodents){
//			r = gen.next();
//			System.out.println(r);
//		}
//		gen.shared.showRefcount();	
//	}
//	
//}
