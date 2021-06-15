package com.learnings.creationalPattern.abstractFactory;

public class PC extends Computer {

	public String ram;

	public String cpu;

	public String hdd;

	@Override
	public String getRam() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}

	public PC(String ram, String cpu, String hdd) {
		super();
		this.ram = ram;
		this.cpu = cpu;
		this.hdd = hdd;
	}

}
