package com.learnings.creationalPattern.abstractFactory;

public class ClientCode {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactorys.getComputer(new PCFactory("2GB", "500GB", "2.9GHZ"));
		System.out.println(pc);
		Computer server = ComputerFactorys.getComputer(new ServerFactory("16GB", "100TB", "9GHZ"));
		System.out.println(server);
		
		
	}
}
