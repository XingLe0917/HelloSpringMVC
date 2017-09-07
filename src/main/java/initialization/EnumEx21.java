package initialization;

//TIJ5 Chapter Initialization, Exercise 21,，page 107
/* 
 * 创建一个enum，包含纸币中最小面值的6种类型。
 * 通过values()循环并打印每一个值及其ordinal()
*/
public class EnumEx21 {

	public enum Bills {
		ONE, TWO, FIVE, TWENTY, FIFTY, HUNDRED
	}


	public void describe(Bills bill) {
		switch (bill) {
		case ONE:
			System.out.println("一元");
		}

	}

	public static void main(String[] args) {
		for (Bills b : Bills.values()){
			System.out.println(b + ",ordinal " + b.ordinal());
		}
			
	}

}
