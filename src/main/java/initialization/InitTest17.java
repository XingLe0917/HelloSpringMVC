package initialization;

//initialization/InitTest17.java
//TIJ5 Chapter Initialization, Exercise 17, Exercise 18，page 101
/* 
 * 创建一个类，它有一个接受String参数的构造器。
 * 在构造阶段，打印该参数。
 * 创建一个该类的对象引用数组，但是不实际去创建对象赋值给该数组。
 * 当运行程序时，请注意来自对构造器的调用中的初始化消息是否打印了出来。
*/
class InitTest{
	InitTest(String s) {
		System.out.println("InitTest()");
		System.out.println(s);
	}
}

public class InitTest17 {

	public static void main(String[] args){
		InitTest[] it = new InitTest[5];
		//Exercise 18，通过创建对象赋值给引用数组
		for(int i = 0; i < it.length; i++)
			it[i] = new InitTest(Integer.toString(i));
	}
}
