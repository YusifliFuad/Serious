package com.neotech.homeworkduring;

public class Person {

	String name, sname;
	int age, weight;

	public Person(String fname, String sname, int age, int weight) {
		this.name = fname;
		this.sname = sname;
		this.age = age;
		this.weight = weight;

	}

	void display() {

		System.out.print("The name is: " + name + "\nThe surname is: " + sname + "\nThe age is: " + age
				+ "/nThe weight is: " + weight);
	}

	public static void main(String[] args) {

		Person p = new Person("Fuad", "Yusifli", 25, 70);

		p.display();

	}

}
