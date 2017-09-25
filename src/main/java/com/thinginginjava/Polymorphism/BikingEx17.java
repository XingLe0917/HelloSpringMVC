// polymorphism/BikingEx17.java
// TIJ4 Chapter Polymorphism, Exercise 17, page 168
/* 使用练习1中的 Cycle 结构，在 Unicycle和 Bicycle中添加 balance()方法，而 Tricycle 中不添加。
 * 创建所有这三种类型的实例，并将它们向上转型成 Cycle 数组。
 * 在该数组的每一个元素上都尝试调用 balance() ,并观察结果。
 * 然后将它们向下转型，再次调用 balance() ，并观察将所产生什么。
*/
package com.thinginginjava.Polymorphism;

class Cycle1{
	private String name = "Cycle";
	public String toString(){
		return this.name;
	}
	public void travel(Cycle1 c){
		System.out.println("Cycle.ride() " + c);
	}
}

class Unicycle1 extends Cycle1{
	private String name = "Unicycle";
	public void balance() {
		System.out.println("Balance Unicycle");
	}
	public String toString() {
		return this.name;
	}	
}
class Bicycle1 extends Cycle1 {
	private String name = "Bicycle";
	public void balance() {
		System.out.println("Balance Bicycle");
	}
	public String toString() {
		return this.name;
	}	
}
class Tricycle1 extends Cycle1 {
	private String name = "Tricycle";
	public String toString() {
		return this.name;
	}	
}
public class BikingEx17 {
	public static void main(String[] args){
		Cycle1[] ride = {
				new Unicycle1(),
				new Bicycle1(),
				new Tricycle1(),
		};
// Compile time error: cannot find balance() method in Cycle:
//		for(Cycle1 c : ride) {
//			c.balance();
//		}
	
		((Unicycle1)ride[0]).balance();
		((Bicycle1)ride[1]).balance();
		// Compile time error: no balance() in Tricycle:
//		 ((Tricycle1)ride[2]).balance();
		// RTTI: ClassCastException: Tricycle cannot be cast to Bicycle:
//		 ((Bicycle1)ride[2]).balance();	
	}
}