package com.learnings.structuralPattern.adapter;

public class SocketObjectAdapter implements SocketAapter {

	private Socket socket = new Socket();
	@Override
	public Volt get120() {
		// TODO Auto-generated method stub
		return socket.getVolt();
	}

	@Override
	public Volt get3() {
		Volt v = socket.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get12() {
		Volt v = socket.getVolt();
		return convertVolt(v, 40);
	}
	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}

}
