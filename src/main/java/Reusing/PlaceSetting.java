package Reusing;

//reusing/PlaceSetting.java
// 结合使用组合和继承
/*
 * 虽然编译器强制你去初始化基类，并且要求你在构造器起始处就要这么做，但是它并不监督你必须将成员对象也初始化。
 * 
 */

class Plate{
	public Plate(int i) {
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate{
	public DinnerPlate(int i) {
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}

class Utensil{
	Utensil(int i){
		System.out.println("Utensil constructor");
	}
}

class Spoon extends Utensil{
	 Spoon(int i) {
		super(i);
		System.out.println("Spoon constructor");
	}
}

class Fork extends Utensil{
	 Fork(int i) {
		 super(i);
		 System.out.println("Fork constructor");
	}
}

class Knife extends Utensil{
	Knife(int i) {
		 super(i);
		 System.out.println("Knife constructor");
	}
}

class Custom{
	Custom(int i){ System.out.println("Custom constructor");}
}

public class PlaceSetting extends Custom{

	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	
	PlaceSetting(int i) {
		super(i+1);
		sp = new Spoon(i+2);
		frk = new Fork(i+3);
		kn = new Knife(i+4);
		pl = new DinnerPlate(i+5);
		System.out.println("PlaceSetting constructor");
	}
	
	public static void main(String[] args){
		PlaceSetting x = new PlaceSetting(9);
	}

}
