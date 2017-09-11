package Reusing;
//reusing/DetergentDelegation.java
//TIJ4 Chapter Reusing, Exercise 11, page 132
//修改 Detergent.java 让它使用代理
class Cleanser_1 {
	private String s = "Cleanser";
	public void append(String a) { s += a; }
	public void dilute() { append(" dilute()"); }
	public void apply() { append(" apply()"); }
	public void scrub() { append(" scrub()"); }
	public String toString() { return s; }
	public static void main(String[] args) {
		Cleanser_1 x = new Cleanser_1();
		System.out.println(x);
	}
}
public class DetergentDelegation11 {
	private String s = "DetergentDelegation";
	Cleanser_1 c = new Cleanser_1();
	public void append(String a){s += a; }
	// two methods delegated entirely to Cleanser c:
	public void dilute() { c.dilute(); }
	public void apply() { c.apply(); }
	// method delegated in part to Cleanser c:
	public void scrub() {
		append(" DetergentDelegation.scrub()");
		c.scrub(); 
	}
	public void foam() { append(" foam()"); } 
	public String toString() { return s + " " + c; }	
	
	public static void main(String[] args) {
		DetergentDelegation11 x = new DetergentDelegation11();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("T esting base class:");
		Cleanser_1.main(args);
	}
}
