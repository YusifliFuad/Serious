package com.neotech.Homework;

public class StudentsDemo {

	public static void main(String[] args) {

		Students student1 = new Students();
		Students student2 = new Students();
		Students student3 = new Students();

		student1.studentName = "Fuad";
		student1.studentId = 127;
		Students.numberOfStudents++;
		student1.studentInfo();
		System.out.println();

		student2.studentName = "Kamran";
		student2.studentId = 704;
		Students.numberOfStudents++;
		student2.studentInfo();
		System.out.println();

		student3.studentName = "Zamin";
		student3.studentId = 007;
		Students.numberOfStudents++;

		student3.studentInfo();
		System.out.println();

	}

}
