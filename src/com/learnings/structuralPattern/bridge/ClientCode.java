package com.learnings.structuralPattern.bridge;

public class ClientCode {

	
	public static void main(String[] args) {
		Shape tri = new Triangle(new Red());
		tri.applyColour();
	}
}
