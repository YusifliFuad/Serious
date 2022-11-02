package com.neotech;

import java.util.Scanner;

public class Scanner_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner info = new Scanner(System.in);
		System.out.println("please enter your firstName :");
		String Fname;
		Fname = info.next();
		System.out.println();

		System.out.println("Please enter your lastName  :");
		String Lname;
		Lname = info.next();
		System.out.println();

		System.out.println("Please enter your age       :");
		int Age;
		Age = info.nextInt();
		System.out.println();

		System.out.println("Please enter your address    :");
		String Address;
		Address = info.next();
		System.out.println();

	}

}
