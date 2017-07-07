package com.springmvc.designpatterns.abstractfactory;

public class ShapeFactory extends AbstractFactory{

	@Override
	IShape getShape(String shapeType) {
		if(shapeType == null){
			return null;
		}
		
		else if(shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}
		
		else if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		return null;
	}

	@Override
	IColor getColor(String color) {
		// TODO Auto-generated method stub
		return null;
	}

}
