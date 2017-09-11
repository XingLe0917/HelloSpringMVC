package Reusing;

//reusing/Stem.java
//TIJ4 Chapter Reusing, Exercise 9, page 130
/* 创建一个Root类，令其含有名为Component1、Component2、Component3的类的各一个实例。
 * 从Root中派生一个类Stem，也含有上述各“组成部分”。
 * 所有的类都应带有可打印类的相关信息的默认构造器。
*/

class Component1 {
	Component1() { System.out.println("Component1()"); }
}

class Component2 {
	Component2() { System.out.println("Component2()"); }
}

class Component3 {
	Component3() { System.out.println("Component3()"); }
}

class Root{
	Component1 c1root;
	Component2 c2root;
	Component3 c3root;
	Root(){
		System.out.println("Root()");
	}
}
public class Stem9 extends Root{
	Component1 c1stem;
	Component2 c2stem;
	Component3 c3stem;
	Stem9() { System.out.println("Stem()"); } 
	public static void main(String[] args) {
		Stem9 s = new Stem9();
	}
}
