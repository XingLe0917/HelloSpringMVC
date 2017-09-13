package Reusing;

//reusing/FinalOverridingIllusionEx.java
//TIJ4 Chapter Reusing, Exercise 20, page 144
//展示@Override注解可以解决本节中的问题。
/*
 * “覆盖”只有在某方法是基类的接口的一部分时才会出现。即，必须能将一个对象向上转型为它的基本类型并调用相同的方法。
 * 如果某方法为private,它就不是基类的接口的一部分。它仅是一些隐藏于类中的程序代码，只不过是具有相同的名称而已。
 */

class WithFinals{
	// Identical to private alone:
	private final void f() { System.out.println("WithFinals.f()"); }
	// Also automatically "final":
	private void g() { System.out.println("WithFinals.g()"); }
}

class OverridingPrivate extends WithFinals{
	// attempt to override:
	private final void f() { System.out.println("OverridingPrivate.f()"); }
	private void g() { System.out.println("OverridingPrivate.g()"); }
	// @Override: compiler finds error - does NOT override
	//@Override private final void f() { System.out.println("OverridingPrivate.f()"); }
	// @Override private void g() { print("OverridingPrivate.g()"); }
}

class OverridingPrivate2 extends OverridingPrivate{
	// attempt to override:
	public final void f() { System.out.println("OverridingPrivate2.f()"); }
	public void g() { System.out.println("OverridingPrivate2.g()"); }
	// use @Override so compiler with say "does NOT override or implement"
	// @Override public final void f() { print("OverridingPrivate2.f()"); }
	// @Override public void g() { print("OverridingPrivate2.g()"); }
}

public class FinalOverridingIllusion {
	public static void main(String[] args){
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		//You can upcast
		OverridingPrivate op = op2;
		//But you can't call the methods:
		//! op.f();
		//! op.g();
		
		//Same here:
		WithFinals wf = op2;
		//! wf.f();
		//! wf.g();
	}

}
