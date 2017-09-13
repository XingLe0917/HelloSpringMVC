package Reusing;
//reusing/JurassicEx.java
//TIJ4 Chapter Reusing, Exercise 22, page 145
//创建一个final类并试着继承它。
class SmallBrain{}

final class Dinosaur{
	int i = 7;
	int j = 1;
	SmallBrain x = new SmallBrain();
	void f() {}
}

//! class Further extends Dinosaur{}
//error:Cannot extend final class 'Dinosaur'

public class JurassicEx22 {
	public static void main(String[] args){
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j ++;
	}

}
