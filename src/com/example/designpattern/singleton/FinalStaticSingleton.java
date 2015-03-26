package com.example.designpattern.singleton;

public class FinalStaticSingleton {
	public final static FinalStaticSingleton Instace = new FinalStaticSingleton();
	private FinalStaticSingleton(){
		//Avoid to be instantiate.
	}
}
