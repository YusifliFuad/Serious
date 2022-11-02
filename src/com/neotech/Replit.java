package com.neotech;

import java.util.Scanner;

public class Replit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner scan = new Scanner(System.in);
//
//		System.out.println("Please first enter areacode the number");
//
//		int areaCode = scan.nextInt();
//
//		System.out.println("Enter the local number");
//
//		long localNumber = scan.nextLong();
//
//		String phoneNumber;
//		phoneNumber = "Calling number";
//
//		System.out.println(phoneNumber + " " + "(" + areaCode + ")" + " " + localNumber);

//		Scanner sc = new Scanner(System.in);
//
//		int hour, minute, second;
//		String amOrPm;
//		System.out.println("Please enter the hour");
//
//		hour = sc.nextInt();
//		System.out.println("Please enter the minute");
//
//		minute = sc.nextInt();
//		System.out.println("Please enter the second");
//
//		second = sc.nextInt();
//		System.out.println("Please enter the Am or PM");
//
//		amOrPm = sc.next();
//
//		System.out.println("The time is: " + hour + ":" + minute + ":" + second + amOrPm);

//		Scanner input = new Scanner(System.in);
//		System.out.println("Welcome to Grader");
//		System.out.println("Please enter subject name number 1 and score for this subject");
//
//		String number1;
//		double grade1;
//		number1 = input.next();
//		grade1 = input.nextDouble();
//
//		System.out.println("Please enter subject name number 2 and score for this subject");
//
//		String number2 = input.next();
//		double grade2 = input.nextDouble();
//		System.out.println("Please enter subject name number 3 and score for this subject");
//		String number3 = input.next();
//		double grade3 = input.nextDouble();
//		System.out.println("Please enter subject name number 3 and score for this subject");
//		String number4 = input.next();
//		double grade4 = input.nextDouble();
//
//		double sum = grade1 + grade2 + grade3 + grade4;
//
//		System.out.println("Summary; " + number1 + "-" + grade1 + number2 + "-" + grade2 + number3 + "-" + grade3
//				+ number4 + "-" + grade4);
//
//		System.out.println("Your average score is: " + sum / 2);

//		Scanner scan = new Scanner(System.in);
//		int seniorCitizens, nonSeniorCitizens, age;
//		System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
//		
//		seniorCitizens = scan.nextInt();
//		nonSeniorCitizens = scan.nextInt();
//		
//		System.out.println("What is new citizen's age?");
//		age = scan.nextInt();
//		
//		if(age>=65) {
//			System.out.println("Senior Citizen");
//			seniorCitizens++;}
//		else(age<=65){
//			
//			System.out.println("Non-Senior Citizen");
//			nonSeniorCitizens++;
//			
//		}
//		
//		

//			
//			
//		
//		
////		
//		Scanner s = new Scanner(System.in);
//
//		System.out.println("what is the farthest planet in the solar system:");
//		System.out.println("a)venus");
//		System.out.println("b)pluto");
//		System.out.println("c)neptune");
//
//		String a = s.nextLine();
//		if (a.equals("a")) {
//			System.out.println("a is wrong");
//		} else if (a.equals("b")) {
//			System.out.println("b is correct");
//		} else if (a.equals("c")) {
//			System.out.println("c is wrong");
//
//		} else {
//			System.out.println(" is not a valid answer");
//		}
//
//		Scanner input = new Scanner(System.in);
//		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
//		int num2 = 0;
//
//		for (int i = 0; i < nums.length; i++) {
//
//			num2 = nums[i];
//			if (num2 % 2 == 0) {
//
//				System.out.println(num2);
//			}
//		}

		Scanner input = new Scanner(System.in);
		int[] nums = { input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt() };
		// DO NOT TOUCH ABOVE
		// TODO: Write your code below

		int total = 0;

		for (int i = 0; i < nums.length; i++) {
			total += nums[i];

			System.out.print(total + " ");
		}

	}

}
