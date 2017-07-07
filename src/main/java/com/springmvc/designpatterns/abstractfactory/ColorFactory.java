package com.springmvc.designpatterns.abstractfactory;

public class ColorFactory extends AbstractFactory{

	@Override
	IShape getShape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	IColor getColor(String colorType) {
		if(colorType == null){
			return null;
		}
		else if(colorType.equalsIgnoreCase("red")){
			return new Red();
		}
		else if(colorType.equalsIgnoreCase("green")){
			return new Green();
		}
		return null;
	}

}
