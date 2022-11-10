package com.neotech.Homework;

public class Test {

	public static void main(String[] args) {

		Car c = new Car();

		c.make = "BMW";
		c.model = "M5";
		c.color = "Black";
		c.year = 2018;

		c.drive();

		SportsCar sp = new SportsCar();
		sp.make = "G Wagon";
		sp.color = "Red";
		sp.fast = true;
		sp.year = 2015;
		sp.spoiler = "yes";
		sp.drive();
		sp.fastspeed();

	}

}
