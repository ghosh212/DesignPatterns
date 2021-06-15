package com.learnings.structuralPattern.adapter;

public class Socket {

	public Volt getVolt() {
		return new Volt(120);
	}
}
