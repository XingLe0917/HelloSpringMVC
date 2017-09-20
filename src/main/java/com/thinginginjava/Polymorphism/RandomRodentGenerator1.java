package com.thinginginjava.Polymorphism;

import java.util.Random;

public class RandomRodentGenerator1 {
	private Random rand = new Random();
	public Rodent1 next() {
		switch (rand.nextInt(3)) {
			default:
			case 0 : return new Mouse1();
			case 1 : return new Rat1();
			case 2 : return new Squirrel1();
		}
		
	}
}
