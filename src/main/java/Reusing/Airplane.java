package Reusing;
//TIJ4, Chapter Reusing, Exercise 1, page 127 
/* 创建一个简单的类。
 * 在第二个类中，将一个引用定义为第一个类的对象。
 * 运用惰性初始化来实例化这个对象。
*/
class Engine {
	private String s;

	Engine() {
		System.out.println("Engine()");
		s = "Constructed";
	}

	public String toString() {
		return s;
	}
}

public class Airplane {
	private String fuselage, wings, tail;
	private Engine e;

	public Airplane() {
		System.out.println("Inside Airplane()");
		fuselage = "Body";
		wings = "Airfoils";
		tail = "Empennage";
	}

	public String toString() {
		if (e == null) // lazy (delayed) initialization:
			e = new Engine();
		return "fuselage = " + fuselage + ", " + "wings = " + wings + ", " + "tail = " + tail + ", " + "Engine = " + e;
	}

	public static void main(String[] args) {
		Airplane N1234 = new Airplane();
		System.out.println(N1234);
	}
}
