// polymorphism/ReferenceCountingEx13.java
// TIJ4 Chapter Polymorphism, Exercise 13, page 162
/* 在 ReferenceCounting.java 中添加一个finalize()方法，
 * 用来校验终止条件（查看第五章 初始化和清理）
*/
package com.thinginginjava.Polymorphism;

class Shared {
	private int refcount = 0;
	private static long counter = 0;
	private final long id = counter++;
	public Shared() {
		System.out.println("Creating "+this);
	}
	public void addRef() { refcount++; }
	protected void dispose() {
		if(--refcount == 0){
			System.out.println("Disposing "+this);
		}
	}
	public String toString() { return "Shared "+id;}
	//Exercise 14中用到showRefcount
	public void showRefcount() { System.out.println("refcount = " + refcount); }	
	protected void finalize() {
		if(refcount > 0)
			System.out.println("Error: " + refcount + " Shared " + id + " objects in use");
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	public Composing(Shared shared){
		System.out.println("Creating "+ this);
		this.shared = shared;
		this.shared.addRef();
	}
	protected void dispose() {
		System.out.println("dispose "+ this);
		shared.dispose();
	}
	public String toString(){
		return "Composing "+id;
	}
}


public class ReferenceCountingEx13 {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = { new Composing(shared), new Composing(shared), new Composing(shared),
				new Composing(shared), new Composing(shared) };
		for(Composing c : composing){
			c.dispose();
		}
		Composing compTest = new Composing(shared);
		Composing compTest2 = new Composing(shared);
		// Test finalize():
		shared.finalize();
		Shared sharedTest = new Shared();
		Composing compTest3 = new Composing(sharedTest);
		// Test sharedTest finalize():
		sharedTest.finalize();
	}
}
