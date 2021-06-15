package com.learnings.structuralPattern.bridge;

public class Triangle extends Shape {

	public Triangle(Colour c) {
		super(c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyColour() {
		System.out.println("Colour is");
		colour.applycolour();
		
	}

}
