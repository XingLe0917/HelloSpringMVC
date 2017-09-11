package Reusing;

//reusing/Stem10.java
//TIJ4 Chapter Reusing, Exercise 10, page 130
/* 
 * 修改练习10，使每个类都仅具有非默认的构造器。
*/
class Component_1 {
	Component_1(byte b) { System.out.println("Component1(byte)"); }
}

class Component_2 {
	Component_2(short s) { System.out.println("Component2(short)"); }
}

class Component_3 {
	Component_3(int i) { System.out.println("Component3(int)"); }
}

class Root_1{
	Component_1 c1root;
	Component_2 c2root;
	Component_3 c3root;
	Root_1(float f) { 
		c1root = new Component_1((byte)0);
		c2root = new Component_2((short)0);
		c3root = new Component_3(0);
		System.out.println("Root(foat)"); 
	} 
}

public class Stem10 extends Root_1{
	Component_1 c1stem10;
	Component_2 c2stem10;
	Component_3 c3stem10;
	Stem10(double d) {
		super(2.78f);
		c1stem10 = new Component_1((byte)1);
		c2stem10 = new Component_2((short)1);
		c3stem10 = new Component_3(1);
		System.out.println("Stem10(double)"); 
	}
	public static void main(String[] args) {
		Stem10 x = new Stem10(2.78);
	}

}
