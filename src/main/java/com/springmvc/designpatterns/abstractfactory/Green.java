package com.springmvc.designpatterns.abstractfactory;

public class Green implements IColor{

	@Override
	public void fill() {
		System.out.println("Green 的 fill() 方法.");
	}

}
