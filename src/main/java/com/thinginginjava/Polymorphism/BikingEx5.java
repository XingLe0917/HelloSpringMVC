// polymorphism/Biking5.java
// TIJ4 Chapter Polymorphism, Exercise 5, page 153
/* 以练习1为基础，在Cycle中添加wheels()方法，它将返回轮子的数量。
 * 修改ride()方法，让它调用wheels()方法，并验证多态起作用了。
*/
package com.thinginginjava.Polymorphism;

class Cycle5{
	private String name = "Cycle";
	private int wheels = 0;
	public String toString(){
		return this.name;
	}
	public void travel(Cycle5 c){
		System.out.println("Cycle.ride() " + c);
	}
	public int wheels(){
		return wheels;
	}
}
class Unicycle5 extends Cycle5 {
	private String name = "Unicycle";
	private int wheels = 1;
	@Override 
	public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	
}

class Bicycle5 extends Cycle5 {
	private String name = "Bicycle";
	private int wheels = 2;
	@Override 
	public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	

}

class Tricycle5 extends Cycle5 {
	private String name = "Tricycle";
	private int wheels = 3;
	@Override 
	public int wheels() { return wheels; }
	public String toString() {
		return this.name;
	}	
}

public class BikingEx5 {
	public static void ride(Cycle5 c){
		c.travel(c);
		System.out.println("wheels: " + c.wheels());
	}
	public static void main(String[] args) {
		Unicycle5 u = new Unicycle5();
		Bicycle5 b = new Bicycle5();
		Tricycle5 t = new Tricycle5();
		ride(u); // upcast to Cycle
		ride(b);
		ride(t);		
	}
}
