package com.springmvc.designpatterns.singleton;
//单例模式
/*
 * 懒汉式
 */
public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton() {}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
}
