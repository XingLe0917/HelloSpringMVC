package initialization;

import java.util.Arrays;
import java.util.Random;

//创建一个非基本类型的数组
public class ArrayClassObj {
	
	private static void print(String s){
		System.out.println(s);
	}
	
	public static void main(String[] args){
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		print("length of a = " + a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(500);
		}
		print(Arrays.toString(a));
		
	}
}
