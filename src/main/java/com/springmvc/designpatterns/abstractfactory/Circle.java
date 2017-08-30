package com.springmvc.designpatterns.abstractfactory;

public class Circle implements IShape{

	@Override
	public void draw() {
		System.out.println("Circle 的 draw() 方法");
	}

}