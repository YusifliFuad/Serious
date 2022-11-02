package com.neotech.homeworkduring;

public class Task3 {

	protected int intArray(int[] arr) {

		int sum = 0;

		for (int el : arr)

			sum += el;

		return sum;

	}

	public static void main(String[] args) {

		Task3 hw = new Task3();
		int[] arra = { 10, 15, 50, 32, };

		int sum = hw.intArray(arra);
		System.out.println(sum);

	}

}
