package Reusing;
//reusing/Car.java
//TIJ4 Chapter Reusing, Exercise 14, page 138
//在Car.java 中给Engine添加一个service()方法，并在main()中调用该方法。

class Engine1{
	public void start() {}
	public void rev() {}
	public void stop() {}
	public void service() { System.out.println("service engine"); }
}

class Wheel{
	public void inflate(int psi) {}
}

class Window{
	public void rollup() {}
	public void rolldown() {}
}

class Door{
	public Window window = new Window();
	public void open() {}
	public void close() {}
}

public class Car14 {
	public Engine1 engine = new Engine1();
	public Wheel[] wheel = new Wheel[4];
	public Door
		left = new Door(),
		right = new Door(); // 2-door
	public Car14() {
		for(int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}
	public static void main(String[] args) {
		Car14 car = new Car14();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
		car.engine.service();
	}	
}
