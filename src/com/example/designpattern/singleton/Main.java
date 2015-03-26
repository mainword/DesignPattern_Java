package com.example.designpattern.singleton;

public class Main {

	public static void main(String[] args) {
		//Simple singleton
		SimpleSingleton s1 = SimpleSingleton.getInstance();
		SimpleSingleton s2 = SimpleSingleton.getInstance();
		if( s1 == s2 ){
			System.out.println("s1 is equal to s2");
		}
		
		//Final static singleton
		FinalStaticSingleton fss1 = FinalStaticSingleton.Instace;
		FinalStaticSingleton fss2 = FinalStaticSingleton.Instace;
		if( fss1 == fss2 ){
			System.out.println("fss1 is equal to fss2");
		}
		
		//DoubleLockSingleton
		DoubleLockSingleton dls1 = DoubleLockSingleton.getInstance();
		DoubleLockSingleton dls2 = DoubleLockSingleton.getInstance();
		if( dls1 == dls2 ){
			System.out.println("dls1 is equal to dls2");
		}		
	}

}
