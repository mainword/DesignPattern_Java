package com.example.designpattern.simplefactory;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Begin");
		Car car = null;
		car = CarFactory.getCar("Toyata");
		car.makeCar();
		
		car = CarFactory.getCar("Honda");
		car.makeCar();
		
		System.out.println("End");
		
	}

}
