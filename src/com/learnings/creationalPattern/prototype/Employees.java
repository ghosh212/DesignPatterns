package com.learnings.creationalPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	public List<String> empList;

	public Employees() {
		empList = new ArrayList<>();
	}

	public Employees(List<String> listSecond) {
		this.empList = listSecond;
	}

	public void addData() {
		empList.add("A");
		empList.add("B");
		empList.add("C");
		empList.add("D");
		empList.add("E");
	}

	public List<String> getList() {
		return empList;
	}

	//clone method is overrided to provide deep copy
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> tempList = new ArrayList<>();
		for (String s : this.empList) {
			tempList.add(s);
		}
		return new Employees(tempList);

	}
	
	

}
