package com.springmvc.designpatterns.abstractfactory;

public class Rectangle implements IShape{

	@Override
	public void draw() {
		System.out.println("Rectangle 的 draw() 方法");
	}

}
