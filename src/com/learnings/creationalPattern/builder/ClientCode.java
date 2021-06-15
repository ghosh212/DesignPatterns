package com.learnings.creationalPattern.builder;

public class ClientCode {
	
	public static void main(String[] args) {
		
		Computer comp = new Computer.ComputerBuilder(
				"500 GB", "2 GB").build();
		
	}

}
