package com.springmvc.controller;

public class Assert {
	private static void perr(String msg) {
		System.err.println(msg);
//		System.out.println(msg);
	}

	public final static void is_true(boolean exp) {
		if (!exp)
			perr("Assertion failed");
	}

	public final static void is_false(boolean exp) {
		if (exp)
			perr("Assertion failed");
	}

	public final static void is_true(boolean exp, String msg) {
		if (!exp)
			perr("Assertion failed: " + msg);
		else
			perr("Assertion true: " + msg);
	}

	public final static void is_false(boolean exp, String msg) {
		if (exp)
			perr("Assertion failed: " + msg);
	}

	public static void main(String[] args) {
		Assert.is_true((2 + 2) == 5);
		Assert.is_false((1 + 1) == 2);
		Assert.is_true((2 + 2) == 3, "2 + 2 == 3");
//		Assert.is_false((1 + 1) == 2, "1 +1 != 2");
	}
}
