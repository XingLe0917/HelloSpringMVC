// interfaces/Ex2.java
// TIJ4 Chapter Interfaces, Exercise 2, page 171
// 创建一个不包含任何抽象方法的抽象类，并验证我们不能为该类创建任何实例。
package com.thinginginjava.Interfaces;

abstract class Nogo1 {
	Nogo1() { System.out.println("Nogo1()"); }
}

abstract class Nogo2 {}

class Go1 extends Nogo1 {
	Go1() { System.out.println("Go1()"); }
}

public class Ex2 {
	public static void main(String[] args){
		// Nogo1 and Nogo2 cannot be instantiated:
//		 Nogo1 ng1 = new Nogo1();
//		 Nogo2 ng2 = new Nogo2();
		Go1 go1 = new Go1();
	}

}
