package com.neotech;

import java.util.Scanner;

public class HomeWorkReplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan = new Scanner(System.in);
//		int first, second;
//
//		System.out.println("Please enter the value");
//		first = scan.nextInt(); // do not change
//		second = scan.nextInt();
//
//		System.out.print("The first one is " + first);
//		System.out.println("The second one is " + second);

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Please enter the topic");
//		String topic1 = "Java";
//
//		topic1 = scan.nextLine();
//
//		System.out.println("Please enter the second topic");
//		String topic2 = "SQL";
//		topic2 = scan.nextLine();
//
//		if (topic1.equals("Java") && topic2.equals("SQL")) {
//			System.out.println("I will learn" + topic1 + "and " + topic2);
//		} else {
//			System.out.println("Invalid");
//		}

//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Add the positive number");
//
//		int number = input.nextInt();
//	
//
//		int total = 0;
//
//		do {
//			System.out.println("Please add positive number");
//			total+=number;
//		}while(number!=-1);

//		int even = 0;
//		int odd = 0;
//		int total = 0;
//
//		for (int i = 1; i <= 50; i++) {
//
//			if (i % 2 == 0) {
//				even += i;
//
//			} else {
//				odd += i;
//			}
//
//			total += i;
//		}
//
//		System.out.println("The even number is " + even);
//		System.out.println("The odd number is " + odd);
//		System.out.println("The total is " + total);

//		for (int i = 1; i <= 5; i++) {
//
//			for (int j = 1; j <= i; j++) {
//				System.out.print(i);
//
//			}
//
//			System.out.println();
//		}

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Please enter the first item and price");
//
//		String item1, item2, item3;
//		double price1, price2, price3;
//		item1 = scan.next();
//		price1 = scan.nextDouble();
//
//		System.out.println("Please enter the second item and price");
//		item2 = scan.next();
//		price2 = scan.nextDouble();
//
//		System.out.println("Please enter the third item and price");
//		item3 = scan.next();
//		price3 = scan.nextDouble();
//
//		System.out.print("Item1: " + item1 + "Price is " + price1 + "Item2: " + item2 + "Price is " + price2 + "Item3: "
//				+ item3 + "Price is " + price3 + "Total is: " + (price1 + price2 + price3));

//		Scanner scan = new Scanner(System.in);
//
//		int num1, num2, num3, sum;
//
//		System.out.println("Please add 3 numbers");
//
//		num1 = scan.nextInt();
//		num2 = scan.nextInt();
//		num3 = scan.nextInt();
//
//		sum = num1 + num2 + num3;
//
//		System.out.println("The sum is: " + sum);

//		Scanner scan = new Scanner(System.in);
//
//		int inputseconds, hours, minutes, seconds;
//		hours = 0;
//		minutes = 0;
//		seconds = 0;
//
//		System.out.println("Enter seconds");
//
//		inputseconds = scan.nextInt();
//
//		hours = minutes / 60;
//		minutes = seconds / 60;
//
//		System.out.println(hours + minutes);

//		Scanner scan = new Scanner(System.in);
//
//		String firstName, lastName, fullName, email, street, state, city, address, contacts;
//		int age, zipcode;
//		double height, weight;
//		boolean isMarried;
//		long workPhoneNumber, personalPhoneNumber;
//
//		System.out.println("Welcome to the patient portal! \nPlease enter your personal information");
//		System.out.println();
//
//		System.out.println("Please enter your first name");
//
//		firstName = scan.next();
//
//		System.out.println("Enter your lastName");
//		lastName = scan.next();
//
//		System.out.println("Enter your email");
//		email = scan.next();
//
//		System.out.println("Enter your street");
//		street = scan.next();
//		System.out.println("Enter your city");
//		city = scan.next();
//		System.out.println("Enter your state");
//		state = scan.next();
//		System.out.println("Enter your zipcode");
//		zipcode = scan.nextInt();
//		System.out.println("Enter your work phone number");
//		workPhoneNumber = scan.nextLong();
//		System.out.println("Enter your personal phone number");
//		personalPhoneNumber = scan.nextLong();
//
//		System.out.println("Enter your age");
//		age = scan.nextInt();
//		System.out.println("Enter your height");
//		height = scan.nextDouble();
//		System.out.println("Enter your weight");
//
//		weight = scan.nextDouble();
//		System.out.println("Are you married");
//		isMarried = scan.nextBoolean();
//
//		System.out.println("Patient personal information\nFull Name: " + firstName + " " + lastName + "Address: "
//				+ street + " " + city + " " + state + " " + zipcode + "\nContacts: workphonenumber " + workPhoneNumber
//				+ "Personal phone number: " + personalPhoneNumber + "email: " + email + "\nAge: " + age + "\nHeight: "
//				+ height + "\nWeight: " + weight + "\nMarried? " + isMarried);
//
////

//		Scanner input = new Scanner(System.in);
//		System.out.println("How many numbers do you want to store into the array?");
//		int o = input.nextInt();
//
//		int[] numb = new int[o];
//		for(int i =0; i<=o-1; i++) {
//			System.out.println("Enter the number");
//			numb[i] = input.nextInt();
//		}

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter Item1 and its price");
//		String item = scan.next();
//		double price = 0;
//		price = scan.nextDouble();
//		String countinue = "yes";
//		System.out.println("Add one more item?");
//		if (countinue.equals("yes")) {
//
//			countinue = scan.next();
//		} else {
//			System.out.println("it is over");
//
//		}
//
//		System.out.println("Enter Item2 and its price?");
//		item = scan.next();
//		price = scan.nextDouble();
//		System.out.println("Add one more item?");
//		countinue = scan.next();

//		Scanner scan = new Scanner(System.in);
//
//		int n;
//		n = scan.nextInt();
//		int factorial = n(n - 1);
//
//		System.out.print(factorial);
//
//	}
//
//	private static int n(int i) {
//		// TODO Auto-generated method stub
//		return 0;

//		Scanner scan = new Scanner(System.in);
//		String word = scan.nextLine();
//		String sentence = scan.nextLine();
//
//		if (sentence.contains(word)) {
//
//			System.out.println(true);
//		} else {
//			System.out.println(false);
//		}

		Scanner scan = new Scanner(System.in);

		// WRITE YOUR CODE HERE
		System.out.println("Enter full name");
		String str;
		str = scan.next();
		if (str.equalsIgnoreCase("Max Payne")) {

			System.out.println("User Found");
		} else if (str.equalsIgnoreCase("Alan Wake")) {
			System.out.println("User found");
		} else {
			System.out.println("User not found ");
		}

	}

}
