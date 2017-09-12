package Reusing;
//reusing/Frog17.java
//TIJ4, Chapter Reusing, Exercise 17, page 140
/* 
* 修改练习16，使Frog覆盖基类中方法的定义（令新定义使用相同的方法特征签名）。
* 留心main()中都发生了什么。
*/
class Amphibian_1{
	protected void swim() {
		System.out.println("Amphibian swim");
	}
	protected void speak() {
		System.out.println("Amphibian speak");
	}
	void eat() {
		System.out.println("Amphibian eat");
	}
	static void grow(Amphibian_1 a){
		System.out.println("Amphibian grow");	
		a.eat();
	}
}
public class Frog17 extends Amphibian_1{
	//@Override 并不是关键字，但是可以把它当作关键字使用。
	//当你想要覆盖某个方法时，可以选择添加这个注解，在你不留心重载而非覆写了该方法时，编译器就会生成一条错误消息。
	@Override
	 protected void swim() {
		 System.out.println("Frog swim");		
	}
	@Override 
	protected void speak() {
		System.out.println("Frog speak");
	}
	@Override 
	void eat() {
		System.out.println("Frog eat");
	}
	static void grow(Amphibian_1 a) {
		System.out.println("Frog grow");
	}
		
	public static void main(String[] args) {
		Frog17 f = new Frog17();
		// call overridden base-class methods:
		f.swim();
		f.speak();
		f.eat();
		// upcast Frog17 to Amphibian argument:
		f.grow(f);
		// upcast Frog17 to Amphibian and call Amphibian method:
		Amphibian_1.grow(f);
	}
}
