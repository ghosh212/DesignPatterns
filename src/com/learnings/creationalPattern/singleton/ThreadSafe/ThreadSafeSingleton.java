package com.learnings.creationalPattern.singleton.ThreadSafe;

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instance;

	private ThreadSafeSingleton() {

	}

	public static ThreadSafeSingleton getInstance() {
		synchronized (ThreadSafeSingleton.class) {
			if (instance == null) {
				instance = new ThreadSafeSingleton();
			}
		}
		return instance;
	}

	public static synchronized ThreadSafeSingleton getInstance_1() {
		if (instance == null) {
			instance = new ThreadSafeSingleton();
		}
		return instance;
	}
}

//singleton is destroyed by reflection
/*
 * ThreadSafeSingleton instanceOne =
 * ThreadSafeSingleton.getInstance(); ThreadSafeSingleton
 * instanceTwo = null; try { Constructor[] constructors =
 * ThreadSafeSingleton.class.getDeclaredConstructors(); for (Constructor
 * constructor : constructors) { //Below code will destroy the ThreadSafeSingleton pattern
 * constructor.setAccessible(true); instanceTwo = (ThreadSafeSingleton)
 * constructor.newInstance(); break; } } catch (Exception e) {
 * e.printStackTrace(); }
 */