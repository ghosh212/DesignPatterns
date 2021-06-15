package com.learnings.structuralPattern.bridge;

public class Pentagon extends Shape {

	public Pentagon(Colour c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColour() {
		System.out.println("The colour is :");
		colour.applycolour();	
	}

}
