package com.learnings.creationalPattern.prototype;

import java.util.List;

public class ClientCode {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Employees emp= new Employees();
		emp.getList();
		
		Employees emp1 =  (Employees) emp.clone();
		List<String> tempList = emp1.getList();
		tempList.add("FF");
		System.out.println(tempList);
		Employees emp2 = (Employees) emp.clone();
		
		
	}
}
