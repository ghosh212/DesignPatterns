package com.learnings.creationalPattern.singleton.lazyInitialization;

public class LazyInitializatedSingleton {

	private static LazyInitializatedSingleton instance;
	
	private LazyInitializatedSingleton() {
		
	}
	
	public static LazyInitializatedSingleton getInstance() {
		if (instance == null) {
			instance = new LazyInitializatedSingleton();
		}
		return instance;
	}
}


//The above implementation works fine in case of the single-threaded environment but when it comes to multithreaded systems, 
//it can cause issues if multiple threads are inside the if condition at the same time. 
//It will destroy the singleton pattern and both threads will get the different instances of the singleton class.