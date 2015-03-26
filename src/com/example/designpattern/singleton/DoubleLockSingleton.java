package com.example.designpattern.singleton;

public class DoubleLockSingleton {
	private static DoubleLockSingleton instance = null;
	
	protected DoubleLockSingleton(){
		//Avoid to be instantiate. 
	}
	
	public static DoubleLockSingleton getInstance(){
		if( instance == null ){
			synchronized(DoubleLockSingleton.class) {
				if( instance == null ){
					instance = new DoubleLockSingleton();
				}
			}	
		}
		return instance;
	}	
}
