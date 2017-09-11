package Reusing;
//reusing/Overload.java
//TIJ4 Chapter Reusing, Exercise 13, page 136
/*
* 创建一个类，它应带有一个被重载了三次的方法。
* 继承产生一个新类，并添加一个该方法的新的重载定义，展示这四个方法在导出类中都是可以使用的。
*/

class ThreeWay {
	void number(byte b) { System.out.println(b); }
	void number(short s) { System.out.println(s); }
	void number(int i) {  System.out.println(i); }
}

public class Overload13 extends ThreeWay{
	void number(float f) { System.out.println(f);}
	public static void main(String[] args) {
		Overload13 ov = new Overload13();
		ov.number((byte)0);
		ov.number((short)1);
		ov.number(2);
		ov.number(3.0f);
	}
}
