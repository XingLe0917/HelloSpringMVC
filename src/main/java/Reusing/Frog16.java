package Reusing;
//reusing/Frog.java
//TIJ4, Chapter Reusing, Exercise 16, page 140
/* 
* 创建一个名为Amphibian的类。
* 由此继承产生一个称为Frog的类。
* 在基类中设置适当的方法。
* 在main()中，创建一个Frog并向上转型至Amphibian，然后说明所有方法都可以工作。
*/
class Amphibian{
	protected void swim() {
		System.out.println("Amphibian swim");
	}
	protected void speak() {
		System.out.println("Amphibian speak");
	}
	void eat() {
		System.out.println("Amphibian eat");
	}
	static void grow(Amphibian a){
		System.out.println("Amphibian grow");
		a.eat();
	}
}

public class Frog16 extends Amphibian{
	public static void main(String[] args){
		Frog16 f = new Frog16();
		// call base-class methods:
		f.swim();
		f.speak();
		f.eat();
		// upcast Frog to Amphibian argument:
		Amphibian.grow(f);
	}

}
