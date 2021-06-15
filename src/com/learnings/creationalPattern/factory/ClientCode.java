package com.learnings.creationalPattern.factory;

//this is the only class visible to client
public class ClientCode {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer("PC", "2.9GHZ", "ITB", "4GB");
		System.out.println(pc);
		Computer server = ComputerFactory.getComputer("Server", "8.9GHZ", "100TB", "32GB");
		System.out.println(server);
	}
}
