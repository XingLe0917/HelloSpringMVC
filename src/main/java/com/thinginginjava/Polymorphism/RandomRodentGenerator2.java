//package com.thinginginjava.Polymorphism;
//
//import java.util.Random;
//
//public class RandomRodentGenerator2 {
//	private Random rand = new Random();
//	protected Shared shared = new Shared();
//	public Rodent2 next() {
//		switch (rand.nextInt(3)) {
//			default:
//			case 0 : return new Mouse2(shared);
//			case 1 : return new Rat2(shared);
//			case 2 : return new Squirrel2(shared);
//		}
//		
//	}
//}
