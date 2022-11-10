package com.neotech.Homework;

public class Student {

	String name, sname;
	int id;
	String schoolName;

	public void displayInfo(String name, String sname, int id, String schoolName) {

		System.out.println("Student name: " + name);
		System.out.println("Student surname " + sname);
		System.out.println("Student id: " + id);
		System.out.println("Student's school: " + schoolName);
	}

}

class NeotechStudent extends Student {
	public void displayInfo(String name, String sname, int id, String schoolName) {

		super.name = name;
		super.sname = sname;
		super.id = id;
		super.schoolName = schoolName;

		System.out.println("Student name: " + super.name);
		System.out.println("Student surname " + super.sname);
		System.out.println("Student id: " + super.id);
		System.out.println("Student's school: " + super.schoolName);

	}

}

class CollegeStudent extends Student {

	public void displayInfo(String name, String sname, int id, String schoolName) {
		super.name = name;
		super.sname = sname;
		super.id = id;
		super.schoolName = schoolName;

		System.out.println("Student name: " + super.name);
		System.out.println("Student surname " + super.sname);
		System.out.println("Student id: " + super.id);
		System.out.println("Student's school: " + super.schoolName);

	}
}

class SchoolStudent extends Student {

	public void displayInfo(String name, String sname, int id, String schoolName) {
		super.name = name;
		super.sname = sname;
		super.id = id;
		super.schoolName = schoolName;

		System.out.println("Student name: " + super.name);
		System.out.println("Student surname " + super.sname);
		System.out.println("Student id: " + super.id);
		System.out.println("Student's school: " + super.schoolName);
	}

}
