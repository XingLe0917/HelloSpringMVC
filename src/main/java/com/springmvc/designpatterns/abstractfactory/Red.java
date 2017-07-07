package com.springmvc.designpatterns.abstractfactory;

public class Red implements IColor{

	@Override
	public void fill() {
		System.out.println("Red  的 fill() 方法.");
	}

}
