package Reusing;

//reusing/Ex7/C7.java
//TIJ4 Chapter Reusing, Exercise 7, page 130
/* 修改练习5，使A和B以带参数的构造器取代默认的构造器。
 * 为C写一个构造器，并在其中执行所有的初始化。
*/
class A7 {
	A7(char c, int i) {
		System.out.println("A(char, int)");
	}
}

class B7 extends A7 {
	B7(String s, float f) {
		super(' ', 0);
		System.out.println("B(String, float)");
	}
}

public class C7 extends A7{

	private char c;
	private int i;
	C7(char a, int j) {
		super(a, j);
		c=a;
		i=j;
	}
	B7 b = new B7("hi", 1f);// will then construct another A and then a B
	public static void main(String[] args){
		C7 c = new C7('b', 2);// will construct an A first
	}

}
