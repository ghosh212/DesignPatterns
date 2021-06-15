package com.learnings.creationalPattern.abstractFactory;

public class ServerFactory implements ComputerAbsstractFactory {
	private String ram;
	private String hdd;
	private String cpu;

	public ServerFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer creteComputer() {
		// TODO Auto-generated method stub
		return new Server(ram, cpu, hdd);
	}
}
