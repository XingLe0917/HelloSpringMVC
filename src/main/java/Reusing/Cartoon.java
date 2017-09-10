package Reusing;
//reusing/Cartoon2.java
//TIJ4 Chapter Reusing, Exercise 3, page 129 
/* 
* 证明之前的这句话。（即使你不为Cartoon()创建构造器，编译器也会为你合成一个默认的构造器，
* 该构造器将调用基类的构造器。）
*/
class Art{
	Art() { System.out.println("Art constructor.");}
}

class Drawing extends Art{
	Drawing() { System.out.println("Drawing constructor."); }
}

public class Cartoon extends Drawing{
//	public Cartoon() { System.out.println("Cartoon constructor."); }
	public static void main(String[] args){
		Cartoon x = new Cartoon();
	}
}
