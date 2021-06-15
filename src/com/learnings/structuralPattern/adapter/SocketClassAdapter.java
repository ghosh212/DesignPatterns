package com.learnings.structuralPattern.adapter;

public class SocketClassAdapter extends Socket implements SocketAapter{

	@Override
	public Volt get120() {
		// TODO Auto-generated method stub
		return getVolt();
	}

	@Override
	public Volt get3() {
		// TODO Auto-generated method stub
		Volt v = getVolt();
		 return convertVolt(v, 10);
	}

	@Override
	public Volt get12() {
		Volt v =  getVolt();
		return convertVolt(v, 40);
	}

	
	private Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolts()/i);
	}
}
