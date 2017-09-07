package initialization;

//由于switch是要在有限的可能值集合中进行选择，因此它与enum是绝佳的组合
public class Burrito {
	Spiciness degree;

	public Burrito(Spiciness degree) {
		this.degree = degree;
	}

	public void describe() {
		System.out.print("This burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all.");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot.");
			break;
		case FLAMING:
		default:
			System.out.println("maybe too hot");
			break;
		}
	}
	
	public static void main(String[] args){
		Burrito plain = new Burrito(Spiciness.NOT);
		Burrito greenChile = new Burrito(Spiciness.MEDIUM);
		Burrito jalapeno = new Burrito(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}

}
