package com.springmvc.base;

// 使用 finalize() 删除没有被合适的清理的对象
class Book{
	boolean checkedOut = false;
	Book(boolean checkOut){
		checkedOut = checkOut;
	}
	
	void checkIn(){
		checkedOut = false;
	}
	
	protected void finalize() {
		if(checkedOut){
			System.out.println("Error:checked out");
			//super.finalize();
		}
	}
}

public class TerminationCondition {
	
	public static void main(String[] args){
		Book novel = new Book(true);
		//Proper cheanup
		novel.checkIn();
		//Drop the reference,forget to clean up
		new Book(true);
		//Force garber collection & finalization
		System.gc();
		
	}
	
	

}
