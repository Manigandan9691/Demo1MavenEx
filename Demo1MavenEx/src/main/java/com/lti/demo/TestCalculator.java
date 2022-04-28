package com.lti.demo;

public class TestCalculator {

	public static void main(String[] args) {
		 Calculator c=new Calculator();
		 int r=c.addNos(100,200);
		 System.out.println("Addition is: "+r);
		int x=c.subNos(400, 200);
		System.out.println("Subraction is: "+x);
	}

}
