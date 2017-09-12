package Reusing;

//reusing/Ex8.java
//TIJ4 Chapter Reusing, Exercise 18, page 142
/* 
 * 创建一个含有static final域和final域的类，说明二者间的区别。
*/
class SelfCounter {
    private static int count;
    private int id = count++;

    public String toString() { 
    return "SelfCounter " + id; 
    }
}

class WithFinalFields {
    final SelfCounter scf = new SelfCounter();
    static final SelfCounter SELF_COUNTER = new SelfCounter();

    public String toString() {
    return "scf = " + scf + "\nSELF_COUNTER = " + SELF_COUNTER;
    }
}

public class FinalFields18 {
	public static void main(String args[]) {
        System.out.println("First object:");
        System.out.println(new WithFinalFields());
        System.out.println("Second object:");
        System.out.println(new WithFinalFields());
    }
}
