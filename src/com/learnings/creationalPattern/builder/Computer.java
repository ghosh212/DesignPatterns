package com.learnings.creationalPattern.builder;

//Notice that Computer class has only getter methods and no public constructor. 
//So the only way to get a Computer object is through the ComputerBuilder class.
public class Computer {

	// required parameters
	public String hdd;

	public String ram;

	// optional parameters

	public boolean isGPUEnabled;

	public boolean isBTEnabled;

	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGPUEnabled() {
		return isGPUEnabled;
	}

	public boolean isBTEnabled() {
		return isBTEnabled;
	}

	private Computer(ComputerBuilder builder) {
		this.hdd = builder.hdd;
		this.ram = builder.ram;
		this.isBTEnabled = builder.isBTEnabled;
		this.isGPUEnabled = builder.isGPUEnabled;
	}

	// buider class
	public static class ComputerBuilder {

		// required parameters
		public String hdd;

		public String ram;

		// optional parameters

		public boolean isGPUEnabled;

		public boolean isBTEnabled;

		public ComputerBuilder(String hdd, String ram) {
			this.hdd = hdd;
			this.ram = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGPUEnabled) {
			this.isGPUEnabled = isGPUEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBTEnabled) {
			this.isBTEnabled = isBTEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}
}
