package com.neotech.Homework;

public class CreditCard {

	double balance, interest;

	public void CalculateBalance(double balance) {

		this.balance = balance;

		interest = balance / 100;
		System.out.println("The interest for this purchase: " + interest + "%");

	}

}

class Visa extends CreditCard {

	public void CalculateBalance(double balance) {
		super.balance = balance;

		super.interest = super.balance / 100;
		System.out.println(super.interest);

	}

}

class Ax extends CreditCard {
	public void CalculateBalance(double balance) {

		super.balance = balance;
		super.interest = super.balance / 100;
		System.out.println(super.interest);

	}

}
