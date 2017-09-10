package Reusing;

//reusing/E.java
//TIJ4 Chapter Reusing, Exercise 4, page 129
/* 证明基类构造器：总是会被调用；在导出类构造器之前被调用。
*/
class A { A(){ System.out.println("A()");} }

class B extends A { B(){ System.out.println("B()");} }

class C extends B { C(){ System.out.println("C()");} }

class D extends C {
	D() { System.out.println("D()"); }
	public static D makeD() { return new D(); }
	public static void main(String[] args) {
		D d = new D();
		D d2 = makeD();
	}
}
public class E extends D{
	E() { System.out.println("E()"); } 
	public static void main(String[] args) {
		E e = new E();
		// test D:
		System.out.println();
		D.main(args);
	}
}
