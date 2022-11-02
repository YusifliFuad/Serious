package com.neotech.homeworkduring;

public class Employess {

	public static String company;
	public String name;
	protected String lastName;
	private int ssn;
	double salary;

	public void method1() {
		System.out.println("I am a public method");
	}

	protected void method2() {

		System.out.println("I am a protected method");
	}

	void method3() {

	}

	private void method4() {

		System.out.println("I am private method");
	}

	public static void main(String[] args) {
		Employess emp = new Employess();

		company = "NeoTech";
		emp.name = "Sabah";

		emp.salary = 122345;
		emp.lastName = "Bushaj";
		emp.ssn = 123456;

	}

}
