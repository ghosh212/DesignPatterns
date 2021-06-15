package com.learnings.structuralPattern.bridge;

public abstract class Shape {
	
	protected Colour colour;
	
	public Shape(Colour c) {
		this.colour = c;
	}
	
	abstract public void applyColour();

}
