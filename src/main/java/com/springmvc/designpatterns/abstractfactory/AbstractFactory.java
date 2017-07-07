package com.springmvc.designpatterns.abstractfactory;

//为 Color 和 Shape 对象创建抽象类来获取工厂
public abstract class AbstractFactory {
	abstract IShape getShape(String shape);
	abstract IColor getColor(String color);
}
