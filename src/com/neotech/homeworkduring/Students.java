package com.neotech.homeworkduring;

public class Students {

	String Studentname;
	int grade1, grade2, grade3;
	double avg;

	Students(String studentName, int math, int science, int english) {

		avg = (grade1 + grade2 + grade3) / 3;

		System.out.println(studentName + " " + avg);

	}

	public static void main(String[] args) {

		Students stu1 = new Students("Fuad", 98, 89, 85);
		Students stu2 = new Students("Kerim", 42, 36, 78);
		Students stu3 = new Students("Aylin", 56, 34, 98);
		Students stu4 = new Students("Gunes", 78, 65, 90);
		Students stu5 = new Students("Balam", 23, 67, 56);

	}
}
