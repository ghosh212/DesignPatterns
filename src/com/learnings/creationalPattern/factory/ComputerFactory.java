package com.learnings.creationalPattern.factory;

//factory class
public class ComputerFactory {

	public static Computer getComputer(String type, String cpu, String hdd, String ram) {

		if ("PC".equalsIgnoreCase(type)) {
			return new PC(ram, hdd, cpu);
		} else if ("SERVER".equalsIgnoreCase(type)) {
			return new Server(ram, hdd, cpu);
		}

		return null;

	}
}
