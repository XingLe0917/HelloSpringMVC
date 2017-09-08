package Reusing;

class Cleanser {
	private String s = "Cleanser";

	public void append(String a) {
		s += a;
	};

	public void dulute() {
		append("dulute()");
	}

	public void apply() {
		append("apply()");
	}

	public void scrub() {
		append("scrub()");
	}

	public String toString() {
		return s;
	}

	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dulute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
}

public class Detergent extends Cleanser{
	//改变一个方法
	public void scrub(){
		append(" Detergent.scrub()");
		super.scrub(); //调用基类的版本
	}
	
	public void foam(){
		
	}

}
