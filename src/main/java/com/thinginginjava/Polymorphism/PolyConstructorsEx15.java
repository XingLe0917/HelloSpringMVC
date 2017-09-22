// polymorphism/PolyConstructorsEx15.java
// TIJ4 Chapter Polymorphism, Exercise 15, page 164
// 在PolyConstructors.java 中添加一个RectangularGlyph，
// 并证明会出现本节所描述的问题。（在构造器内部的多态方法的行为）
package com.thinginginjava.Polymorphism;

class Glypy {
	void draw() {System.out.println("Glypy.draw()");}
	Glypy() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glypy {
	private int radius = 1;
	RoundGlyph(int r) {
		radius = r;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	void draw(){
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}

class RectangularGlyph extends Glypy {
	private int length = 2;
	private int width = 4;
	RectangularGlyph(int l,int w){
		length = l;
		width = w;
		System.out.println("RectangularGlyph.RectangularGlyph(), length = " 
				+ length + ", width = " + width);
	}
	void draw(){
		System.out.println("RectangularGlyph.draw(), length = " + length 
				+ ", width = " + width);
	}
}

public class PolyConstructorsEx15 {
	public static void main(String[] args){
		new RoundGlyph(5);
		System.out.println("---------------------");
		new RectangularGlyph(3, 6);
	}

}
