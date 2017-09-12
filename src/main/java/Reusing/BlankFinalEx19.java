package Reusing;
//reusing/BlankFinalEx.java
//TIJ4 Chapter Reusing, Exercise 19, page 142
/* 
* 创建一个含有指向某对象的空白final引用的类。
* 在所有构造器内部都执行空白final的初始化。
* 说明Java确保final在使用前必须被初始化，且一旦被初始化即无法改变。
*/
class Poppet{
	private int i;
	Poppet(int ii) { i = ii;}
	public String toString() { 
		return ("Poppet " + "i = "+i); 
	}
}

public class BlankFinalEx19 {
	private final int i = 0; //initialized final
	/**
	 * 如果没有在别处初始化这里会报错 :
	 * The blank final field j may not have been initialized
	 * The blank final field p may not have been initialized
	 */
	private final Poppet p;	//blank final
	private final int j; //Black final 
	
	public BlankFinalEx19(){
		j  = 1; 	//Initialize blank final
		p = new Poppet(1); //Initialize blank final reference
	}
	
	public BlankFinalEx19(int x){
		j = x;	//Initialize blank final
		p = new Poppet(x);	//Initialize blank final reference
	}
	public static void main(String[] args) {
		BlankFinalEx19 b1 = new BlankFinalEx19();
		BlankFinalEx19 b2 = new BlankFinalEx19(47);
		//! b1.p = new Poppet(2); // Errors: cannot assign values 
 		//! b2.p = new Poppet(3); // to final variables p
		System.out.println("b1.p: " + b1.p +" j = " +b1.j);
		System.out.println("b2.p: " + b2.p+" j = " +b1.j);
	}
}
