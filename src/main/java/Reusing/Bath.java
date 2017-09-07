package Reusing;

//使用组合构造器初始化
/*
 * toString() 每一个非基本类型的对象都有一个toString()方法，
 * 而且当编译器需要一个String而你只有一个对象时，该方法便会被调用
 */
class Soap {
	private String s;

	Soap() {
		System.out.println("Soap");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}


public class Bath {
	private String // 1.在定义时初始化
			s1 = "Happy",
			s2 = "Happy", s3, s4;
	private Soap castille;
	private int i;
	private float toy;

	public Bath() { // 2. 在类的构造器中初始化
		System.out.println("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soap();
	}
	
	//3. 实例初始化
	{ i= 47;}
	
	public String toString(){
		if(s4 == null){ //4.惰性初始化
			s4 = "Joy";
		}
		return 
				"s1 = " + s1 +"\n" +
				"s2 = " + s2 +"\n" +
				"s3 = " + s3 +"\n" +
				"s4 = " + s4 +"\n" +
				"i = " + i +"\n" +
				"toy =" + toy +"\n"+
				"castille = " + castille;
	}
	
	public static void main(String[] args){
		Bath b = new Bath();
		System.out.println(b);
	}
	
}
