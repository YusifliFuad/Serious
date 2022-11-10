package com.neotech.Homework;

public class TestCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreditCard cr = new CreditCard();
		cr.CalculateBalance(560);

		Visa vs = new Visa();
		vs.CalculateBalance(340);

		Ax x = new Ax();

		x.CalculateBalance(880);

	}

}
