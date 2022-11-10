package com.neotech.homeworkduring;

public class CalculateTest {

	public static void main(String[] args) {

		CalculateArea cal = new CalculateArea();

		int rec = cal.rectangle(5, 10, 7);
		int sq = cal.square(4);
		int bx = cal.box(3, 6, 4, 2, 9);

		System.out.println(rec);
		System.out.println(sq);
		System.out.println(bx);
	}

}
