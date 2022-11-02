package com.neotech;

public class Phone {

	String name;
	String model;
	String color;
	int year;
	int weight;

	void call() {

		System.out.println(name + " " + model + " can call");

	}

	void texting() {

		System.out.println(name + " " + model + " " + year + " text whoever you want");
	}

	public static void main(String[] args) {

		Phone iPhone = new Phone();
		Phone android = new Phone();
		Phone nokia = new Phone();

		iPhone.name = "Iphone";
		iPhone.model = "14Pro";
		iPhone.color = "Black";
		iPhone.year = 2022;

		iPhone.call();
		iPhone.texting();

		android.name = "Samsung";
		android.model = "Note20ultra";
		android.color = "Navy";
		android.year = 2020;
		android.weight = 10;

		android.call();
		android.texting();

	}

}
