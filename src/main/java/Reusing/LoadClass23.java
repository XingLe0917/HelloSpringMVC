package Reusing;
//reusing/LoadClass23.java
//TIJ4 Chapter Reusing, Exercise 23, page 147
/* 
* 请证明加载类的动作仅发生一次。
* 证明该类的第一个实体的创建或者static成员的访问都有可能引起加载。
*/
class Base1 {
	static int j = printInit("Base1.j initialized");
	static int printInit(String s) {
		System.out.println(s);
		return 1;
	}
	Base1() { System.out.println("Base1() constructor"); }	
} 

class Base2 extends Base1 {
	static int k = printInit("Base2.k initialized");
	Base2() { System.out.println("Base2() constructor"); }	
}

class Base3 {
	static int n = printInitBase3("Base3.n initialized");
	static Base1 a = new Base1();	
	Base3() { System.out.println("Base3() constructor"); }
	static int printInitBase3(String s) {
		System.out.println(s);
		return 1;
	}
}

class Base4 {
	Base4() { System.out.println("Base4() constructor"); }
}

public class LoadClass23 extends Base2{
	static int i = printInit("LoadClass23.i initialized");
	LoadClass23() { System.out.println("LoadClass23() constructor"); }
	
	public static void main(String[] args){
		// accessing static main causes loading (and initialization)
		// of Base1, Base2, & LoadClass23
		System.out.println("hi1------");
		// call constructors from loaded classes:
		LoadClass23 lc = new LoadClass23();
		System.out.println("hi2------");
//		// call to static field loads & initializes Base3:
		System.out.println(Base3.a);
		System.out.println("hi3------");
//		// call to constructor loads Base4:
		Base4 d = new Base4();
	}
}
