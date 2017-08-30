package com.springmvc.base06;

import com.springmvc.base.Cookie;

public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip constructor");
	}

	public static void main(String[] args) {
		ChocolateChip x = new ChocolateChip();
		// ! x.foo(); // Can't access foo .
		//because foo() is default (Friendly access) method
	}
}
