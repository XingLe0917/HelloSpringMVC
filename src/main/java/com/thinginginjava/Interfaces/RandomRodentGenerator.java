package com.thinginginjava.interfaces;

import java.util.Random;

public class RandomRodentGenerator {
	private Random rand = new Random();
	public Rodent_1 next() {
		switch (rand.nextInt(3)) {
			default:
			case 0 : return new Mouse_1();
			case 1 : return new Rat_1();
			case 2 : return new Squirrel_1();
		}
	}

}
