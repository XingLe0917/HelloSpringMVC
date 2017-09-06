package initialization;

import java.util.Random;

//: MultiDimArray.java
//创建多维数组
public class MultiDimArray {
	static Random rand = new Random();

	static int pRand(int mod) {
		return Math.abs(rand.nextInt()) % mod + 1;
	}

	public static void main(String[] args) {
		//第一个例子展示了基本 数据类型的一个多维数组
		int[][] a1 = { { 1, 2, 3, }, { 4, 5, 6, }, };
		for (int i = 0; i < a1.length; i++)
			for (int j = 0; j < a1[i].length; j++)
				prt("a1[" + i + "][" + j + "] = " + a1[i][j]);
		prt("");
		
		//第二个例子展示了用new分配的一个三维数组。 在这里，整个数组都是立即分配的
		// 3-D array with fixed length:
		int[][][] a2 = new int[2][2][4];
		for (int i = 0; i < a2.length; i++)
			for (int j = 0; j < a2[i].length; j++)
				for (int k = 0; k < a2[i][j].length; k++)
					prt("a2[" + i + "][" + j + "][" + k + "] = " + a2[i][j][k]);
		
		prt("");
		
		//第三个例子 揭示出构成矩阵的每个矢量都可以有任意的长度.假若没有明确指定初始化值，数组值就会自动初始化
		// 3-D array with varied-length vectors:
		int[][][] a3 = new int[pRand(7)][][];
		for (int i = 0; i < a3.length; i++) {
			a3[i] = new int[pRand(5)][];
			for (int j = 0; j < a3[i].length; j++)
				a3[i][j] = new int[pRand(5)];
		}
		for (int i = 0; i < a3.length; i++)
			for (int j = 0; j < a3[i].length; j++)
				for (int k = 0; k < a3[i][j].length; k++)
					prt("a3[" + i + "][" + j + "][" + k + "] = " + a3[i][j][k]);
		prt("");
		
		//第四个例子可以看出，它向我们演示了用花括号收集多个new表达式的能力
		// Array of non-primitive objects:
		Integer[][] a4 = { { new Integer(1), new Integer(2) }, { new Integer(3), new Integer(4) },
				{ new Integer(5), new Integer(6) }, };
		for (int i = 0; i < a4.length; i++)
			for (int j = 0; j < a4[i].length; j++)
				prt("a4[" + i + "][" + j + "] = " + a4[i][j]);
		prt("");
		
		//第五个例子展示了如何逐渐构建非基本类型的对象数组
		Integer[][] a5;
		a5 = new Integer[3][];
		for (int i = 0; i < a5.length; i++) {
			a5[i] = new Integer[3];
			for (int j = 0; j < a5[i].length; j++)
				a5[i][j] = new Integer(i * j);
		}
		for (int i = 0; i < a5.length; i++)
			for (int j = 0; j < a5[i].length; j++)
				prt("a5[" + i + "][" + j + "] = " + a5[i][j]);
		prt("");
	}

	static void prt(String s) {
		System.out.println(s);
	}
}
