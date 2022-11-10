package com.neotech.homeworkduring;

public class Degree {

	void getPrerequisite() {

		System.out.println("To get a degree you need high school diploma");

	}

}

class Bachelors extends Degree {

	void getPrerequisite() {

		System.out.println("To get a degree you need bachelor diploma");

	}
}

class Master extends Degree {

	void getPrerequisite() {

		System.out.println("To get a degree you need Master diploma");

	}

}
