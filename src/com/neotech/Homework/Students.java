package com.neotech.Homework;

public class Students {

	String studentName;
	int studentId;
	static int numberOfStudents = 0;

	void studentInfo() {

		System.out.print("Student name is: " + studentName + " StudentId is: " + studentId);
		System.out.println("The number of students: " + numberOfStudents);
	}

}
