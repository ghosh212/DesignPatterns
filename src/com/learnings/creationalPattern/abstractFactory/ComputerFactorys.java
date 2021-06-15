package com.learnings.creationalPattern.abstractFactory;

//entry point for client code to create the sub classes
public class ComputerFactorys {

	public static Computer getComputer(ComputerAbsstractFactory factory) {
		return factory.creteComputer();
		
	}
	
}
