// polymorphism/TransmogrifyEx16.java
// TIJ4 Chapter Polymorphism, Exercise 16, page 165
/* 遵循 Transmogrify.java 这个例子,创建一个 Starship 类，包含一个AlertStatus引用，此引用可以指示三种不同的状态。
 * 纳入一些可以改变这些状态的方法。
*/
package com.thinginginjava.Polymorphism;

class AlertStatus {
	public void alert() {}
}
class NormalAlert extends AlertStatus {
	public void alert() { System.out.println("AlertStatus Normal"); }
}
class HighAlert extends AlertStatus {
	public void alert() { System.out.println("AlertStatus High"); }
}
class MaximumAlert extends AlertStatus {
	public void alert() { System.out.println("AlertStatus Maximum"); }
}
class Starship {
	private AlertStatus alertStatus = new NormalAlert();
	public void normalAlert() { alertStatus = new NormalAlert(); }
	public void highAlert() { alertStatus = new HighAlert(); }
	public void maximumAlert() { alertStatus = new MaximumAlert(); }
	public void checkAlertStatus() { alertStatus.alert(); }
}
public class TransmogrifyEx16 {
	public static void main(String[] args){
		Starship s = new Starship();
		s.checkAlertStatus();
		s.highAlert();
		s.checkAlertStatus();
		s.maximumAlert();
		s.checkAlertStatus();
		s.normalAlert();
		s.checkAlertStatus();
	}

}
