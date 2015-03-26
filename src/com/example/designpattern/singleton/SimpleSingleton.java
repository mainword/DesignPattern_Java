package com.example.designpattern.singleton;

public class SimpleSingleton {
	private static SimpleSingleton instance = null;
	
	protected SimpleSingleton(){
		//Avoid to be instantiate. 
	}
	
	public static SimpleSingleton getInstance(){
		if( instance == null ){
			instance = new SimpleSingleton();
		}
		return instance;
	}
}
