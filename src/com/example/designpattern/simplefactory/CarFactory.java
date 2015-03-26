package com.example.designpattern.simplefactory;

public class CarFactory {
	public static Car getCar(String carType){
		Car car = null;
		if( carType.equals("Toyata")  ){
			car = new ToyataCar();
		}
		else{
			car = new HondoCar();
		}
		return car;		
	}
}
