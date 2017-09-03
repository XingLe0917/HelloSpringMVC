package com.springmvc.base;

public class Name {
	
	Name() {
		// TODO Auto-generated constructor stub
		this("小明");
		System.out.println("我是默认构造器");
	}
	
	Name(String s){
		System.out.println("我是构造器："+s);
	}
	
	public static void main(String[] args){
		new Name();
	}

}
