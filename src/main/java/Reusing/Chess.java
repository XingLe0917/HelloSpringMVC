package Reusing;

//reusing/Chess.java
//TIJ3 Chapter Reusing, Exercise 6, page 130
/* 用Chess.java 来证明一段话。（如果不在BoardGame()中调用基类构造器，
 * 编译器将“抱怨”无法找到符合Game()形式的构造器。
 * 而且，调用基类构造器必须是你在导出类构造器中要做的第一件事（如果你做错了，编译器会提醒你.））
*/

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}	
}

class BoardGame extends Game {
	BoardGame(int i) {
		// print("BoardGame constructor"); // call to super must be first
			// statement in constructor 
		super(i); // else: "cannot find symbol: constructor Game()
		System.out.println("BoardGame constructor");
	}
}
public class Chess extends BoardGame{

	Chess() {
		super(11);
		System.out.println("Chess constructor");
	}
	public static void main(String[] args) {
		Chess x = new Chess();
	}

}
