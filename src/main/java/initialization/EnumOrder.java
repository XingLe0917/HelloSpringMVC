package initialization;

public class EnumOrder {

	public static void main(String[] args) {
		//ordinal() 表示enum常量的声明顺序
		//static values() 按照常量的声明顺序，产生由这些常量构成的数组
		for (Spiciness s : Spiciness.values())
			System.out.println(s + "," + "ordianl " + s.ordinal());
	}
}
