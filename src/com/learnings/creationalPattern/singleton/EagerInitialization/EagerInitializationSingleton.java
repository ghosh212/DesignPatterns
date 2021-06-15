package com.learnings.creationalPattern.singleton.EagerInitialization;

public class EagerInitializationSingleton {

	private static EagerInitializationSingleton instance = new EagerInitializationSingleton();
	
	//constructor must be private
	private EagerInitializationSingleton() {
		
	}
	
	public static EagerInitializationSingleton getInstance() {
		return instance;
	}
}


//In eager initialization, the instance of Singleton Class is created at the time of class loading,
//this is the easiest method to create a singleton class but it has a drawback that instance is 
//created even though client application might not be using it.

