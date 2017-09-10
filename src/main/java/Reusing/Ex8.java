package Reusing;

//reusing/Ex8.java
//TIJ4 Chapter Reusing, Exercise 8, page 130
/* 创建一个基类，它仅有一个非默认构造器；
 * 再创建一个导出类，它带有默认构造器和非默认构造器。
 * 在导出类的构造器中调用基类的构造器。
 */
class A8 {
	A8(char c, int i) {
		System.out.println("A(char, int)");
	}
}

public class Ex8 extends A8 {
	private char c;
	private int i;

	Ex8() {
		super('z', 3);
		System.out.println("Ex8()");
	}

	Ex8(char a, int j) {
		super(a, j);
		c = a;
		i = j;
		System.out.println("Ex8(char,int)");
	}

	public static void main(String[] args) {
		Ex8 ex1 = new Ex8();
		Ex8 ex2 = new Ex8('b', 2);
	}
}
