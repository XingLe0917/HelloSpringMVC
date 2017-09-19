// polymorphism/Music6.java
// TIJ4 Chapter Polymorphism, Exercise 6, page 155
/* 修改 Music3.java 使what() 方法成为根Object的toString()方法。
 * 试用System.out.println方法打印Instrument对象（不用向上转型）
 * 
 * Exercise 7:
 * 向Music3.java添加一个新的类型Instrument，并验证多态性是否作用于所添加的新类型。
 * 
*/
package com.thinginginjava.Polymorphism;

class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}

	public String toString() {
		return "Instrument";
	}

	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}

class Wind extends Instrument {
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	void adjust() {
		System.out.println("Adjusting Wind");
	}
}

class Percussion extends Instrument {
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}

	public String toString() {
		return "Percussion";
	}

	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}

class Stringed extends Instrument {
	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}
//Exercise 7 添加一个新的类型Instrument
class Keyboard extends Instrument {
	void play(Note n) { System.out.println("Keyboard.play() " + n); }
	public String toString() { return "Keyboard"; }
	void adjust() { System.out.println("Adjusting Keyboard"); } 
}

class Piano extends Keyboard {
	void play(Note n) { System.out.println("Piano.play() " + n); }
	public String toString() { return "Piano"; }
}
//////

class Brass extends Wind {
	void play(Note n) { System.out.println("Brass.play() " + n); }
	public String toString() { return "Brass"; }
	void adjust() { System.out.println("Adjusting Brass"); }
}

class Woodwind extends Wind {
	void play(Note n) { System.out.println("Woodwind.play() " + n); }
	public String toString() { return "Woodwind"; }
}

public class Music6 {
	// Doesn't care about type, so new types
	// added to the system still work right:
	public static void tune(Instrument i) {
		//...
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] e){
		for(Instrument i:e){
			tune(i);
		}
	}
	
	//Exercise 6,7
//	public static void main(String[] args){
//		// Upcasting during addition to the array:
//		Instrument[] orchestra = {
//			new Wind(),
//			new Percussion(),
//			new Stringed(),
//			new Brass(),
//			new Woodwind()
//			,new Piano() //Exercise 7
//		};
//		tuneAll(orchestra);
//		for(Instrument i : orchestra)
//			System.out.println(i);
//	}
	
	//Exercise 8
	private static RandomInstrumentGenerator gen = new RandomInstrumentGenerator();
	public static void main(String[] args){
		Instrument[] orchestra = new Instrument[10];
		for(int i = 0;i<orchestra.length;i++)
			orchestra[i] = gen.next();
		tuneAll(orchestra);
		for(Instrument i : orchestra)
			System.out.println(i);
	}
}
