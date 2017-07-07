package com.springmvc.designpatterns.abstractfactory;
/**
 * 抽象工厂模式
 * @author xingle
 * 参考 ：http://www.runoob.com/design-pattern/abstract-factory-pattern.html
 */
public class Demo {
	//使用 FactoryProducer 来获取 AbstractFactory，通过传递类型信息来获取实体类的对象
	public static void main(String[] args){
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
		//获取circle 对象
		IShape shape = shapeFactory.getShape("circle");
		shape.draw();
		
		
		//获取颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("color");
		//获取color 对象
		IColor color1 =  colorFactory.getColor("green");
		color1.fill();
	}

}
