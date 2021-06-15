package com.learnings.creationalPattern.abstractFactory;

//facory class for PC
public class PCFactory implements ComputerAbsstractFactory {

	private String ram;
	private String hdd;
	private String cpu;

	public PCFactory(String ram, String hdd, String cpu) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}

	@Override
	public Computer creteComputer() {
		// TODO Auto-generated method stub
		return new PC(ram, cpu, hdd);
	}

}
