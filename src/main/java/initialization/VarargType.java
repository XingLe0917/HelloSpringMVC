package initialization;

public class VarargType {

	static void f(Character... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}

	static void g(int... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}

	public static void main(String[] args) {
		f('a');
		f();
		g(1);
		g();
		//验证使用可变参数列表不依赖于自动包装机制，实际上使用的是基本类型
		System.out.println("int[]:" + new int[0].getClass());
	}

}
