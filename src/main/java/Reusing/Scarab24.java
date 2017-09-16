package Reusing;
//reusing/Scarab.java
//TIJ4 Chapter Reusing, Exercise 24, page 147
/* 在 Beetle.java中，从Beetle类继承产生一个具体类型的“甲壳虫”。
 * 其形式与现有类相同，跟踪并解释其输出结果。
*/
public class Scarab24 extends Beetle{
	private int n = printInit("Scarab24.n initialized");
	public Scarab24() {
		System.out.println("n = " + n);
		System.out.println("j = " + j);
	}
	
	private static int x3 = printInit("static Scarab24.x3 initialized");
	public static void main(String[] args) {
		System.out.println("Scarab constructor");
		Scarab24 sc = new Scarab24();			
	}
}
