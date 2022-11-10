package com.neotech.Homework;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student st = new Student();

		st.displayInfo("Fuad", "Yusifli", 127, "University of Opole");

		NeotechStudent nt = new NeotechStudent();

		nt.displayInfo("Dardan", "Dardanovic", 65, "Neotech");

		CollegeStudent cg = new CollegeStudent();

		cg.displayInfo("Rovsen", "Emioglu", 007, "Unec");

		SchoolStudent ss = new SchoolStudent();

		ss.displayInfo("Turkan", "Memmedli", 128, "115 sayli orta mekteb");

	}

}
