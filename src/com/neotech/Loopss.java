
package com.neotech;

public class Loopss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner input = new Scanner(System.in);
//
//		System.out.println("Enter the number");
//
//		int num = input.nextInt();
//
//		for (int i = 1; i < num; i++) {
//
//			System.out.print("*");
//		}
//		System.out.println();

//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		for (int l = 0; l < n; l++) {
//
//			for (int s = 0; s <= l; s++) {
//				System.out.print("*");
//			}
//
//			System.out.println();
//
//		}

//		Scanner input = new Scanner(System.in);
//
//		String answer, guest, guestlist = "";
//
//		do {
//			System.out.println("Please enter guest name:");
//			guest = input.next();
//			System.out.println("Do you want to enter new guest name:");
//			answer = input.next();
//			guestlist += guest;
//		} while (answer.equals("yes"));
//		{
//			System.out.println("Guest's list" + guestlist);
//		}

//		Scanner scan = new Scanner(System.in);
//		int inhabitants = scan.nextInt();
//		int day = 0;
//
//		do {
//
//			System.out.println("Day" + (day + 1) + "[" + (inhabitants / 2) + "]");
//			if (inhabitants % 2 == 0) {
//
//				inhabitants = inhabitants / 2;
//			} else {
//				inhabitants = (inhabitants % 2) - inhabitants / 2;
//
//			}
//			day++;
//		} while (inhabitants < 0);
//
//		System.out.println("---EXTINCT---");

		for (int i = 80; i >= 20; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");

			}

		}

	}
}
