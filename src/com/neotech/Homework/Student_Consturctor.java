package com.neotech.Homework;

public class Student_Consturctor {

	String name, address;

	Student_Consturctor(String name, String address) {

		this.name = "Kamran";
		this.address = "1821 S hoga";

		System.out.println("The name of student: " + name + " The address of student: " + address);

		System.out.println(this.name + this.address);

	}

	public static void main(String[] args) {

		Student_Consturctor st = new Student_Consturctor("Fuad", "101 Richland");

	}

}
