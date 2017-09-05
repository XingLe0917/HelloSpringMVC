package initialization;

//Demonstrates initailization order
/*
 * 在类的内部，变量定义的先后顺序决定了初始化的顺序。即使在定义时已经指定初值得变量，这种情况都是成立的；
 * 因此，编译器不会强制你一定要在构造器的某个地方或在使用它们之前对元素进行初始化。
 */
class Window{
	Window(int marker) {
		System.out.println("Window(" + marker + ")");
	}
}

class House{
	Window w1 = new Window(1); //在构造器之前
	House() {
		//构造器中显示的
		System.out.println("House()");
		w3 = new Window(33); //重定义w3
	}
	Window w2 = new Window(2); //在构造器之后
	void f() {
		System.out.println("f()");
	}
	Window w3 = new Window(3); // 在最后
	
}

public class OrderOfInitialization {
	public static void main(String[] args){
		House h = new House();
		h.f();//Shows that construction is done
	}

}
