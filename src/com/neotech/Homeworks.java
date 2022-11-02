package com.neotech;

public class Homeworks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		String[] cars = new String[3];
//		cars[0] = "Lamborghini";
//		cars[1] = "mercedes";
//		cars[2] = "BMW";
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);

//		int[] numbers = new int[3];
//		int sum = 0;
//
//		numbers[0] = 5;
//		numbers[1] = 5;
//		numbers[2] = 5;
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//
//			System.out.println(sum);
//		}

//		String[] countries = { " Turkey", "Azerbaijan", "Albania", "Georgia", "USA" };
//
//		for (String capital : countries) {
//
//			if (capital.equals(" Turkey")) {
//				System.out.println("Istanbul");
//				break;
//
//			} else {
//				System.out.println(capital);
//			}
//
//		}

//		String[][] dimen = { { "Mr", "Mrs", "Ms", "Miss" }, { "Smith", "Jordan", "Jackson", "Obama" } };
//
//		System.out.println(dimen[0][1] + " " + dimen[1][0]);
//		System.out.println(dimen[0][0] + " " + dimen[1][3]);

//		int[] numb = {12,0, 20, 45,65};
//		
//		int largest = numb[0];
//		
//		for(int i = 0; i<numb.length;i++ ) {
//			
//			if(largest<numb[i]) {
//				largest= numb[i];
//			}
//		}

//		int[][] numbers = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
//
//		for (int row = 0; row < numbers.length; row++) {
//
//			for (int col = 0; col < numbers[row].length; col++) {
//
//				System.out.print(numbers[row][col] + " ");
//			}
//
//			System.out.println();
//
//		}

		int[][] numb = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
//
//		for (int[] row : numb) {
//
//			for (int col : row) {
//
//				if (col % 2 == 0) {
//					System.out.print(col + " ");
//				}
//
//			}
//
//		}
		System.out.println("-------------------------");

//		for (int row = 0; row < numb.length; row++) {
//
//			for (int col = 0; col < numb[row].length; col++) {
//
//				if (numb[row][col] % 2 == 0) {
//
//					System.out.println(numb[row][col]);
//				}
//
//			}
//
//		}

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
//		System.out.println("New seniorCitizens count " + seniorCitizens );
//		System.out.println("New nonSeniorCitizens count " + nonSeniorCitizens);

//		String str = "      Happy Birthday     ";
//		System.out.println(str.trim());
//
//		String str1 = "Yusifli";
//		str1 = str1.concat("Fuad").concat(" 8").concat(".");
//
//		System.out.println(str1);
////		

//		Scanner scan = new Scanner(System.in);
//		String mom, dad;
//		String gender;
//
//		System.out.println("Mom's first name?");
//		mom = scan.next();
//
//		System.out.println("Dad's first name?");
//		dad = scan.next();
//
//		System.out.println("Boy or Girl?");
//		gender = scan.next();
//
//		if (gender.equals("Boy")) {
//
//			System.out
//					.println("Suggested name is: " + dad.substring(dad.length() / 2) + mom.substring(mom.length() / 2));
//		} else if (gender.equals("Girl")) {
//
//			System.out
//					.println("Suggested name is: " + mom.substring(mom.length() / 2) + dad.substring(dad.length() / 2));
//		} else {
//			System.out.println("Not valid!");
//		}

//		String str = "Sunday";
//
//		for (int i = str.length() - 1; i >= 0; i--) {
//
//			char c = str.charAt(i);
//			System.out.print(c);
//		}
//
//		System.out.println();
//
//		char[] charArray = str.toCharArray();
//		for (int i = str.length() - 1; i >= 0; i--) {
//			char c = charArray[i];
//			System.out.print(c);
//		}
//
//		StringBuffer strB = new StringBuffer(str);
//		strB.reverse();
//		System.out.print(strB);
//
//		System.out.println("-----------------");
//
//		String strSplit = "Today is tuesday  and we have a Java class!!!";
//
//		String[] strArray1 = strSplit.split(" ");
//		for (String word : strArray1) {
//
//			StringBuffer strstr = new StringBuffer(word);
//
//			strstr.reverse();
//			System.out.print(strstr + " ");
//		}
//
//		System.out.println("-------------------------");
//
//		String herf = "Friday";
//
//		for (int i = herf.length() - 1; i >= 0; i--) {
//
//			char c = herf.charAt(i);
//			System.out.print(c);
//
//		}
//
//		System.out.println();
//
//		String cumle = "Today is friday and we are free ";
//
//		String[] cumle1 = cumle.split(" ");
//
//		for (String soz : cumle1) {
//
//			StringBuffer cumle2 = new StringBuffer(soz);
//			cumle2.reverse();
//			System.out.print(cumle2 + " ");
//		}

	}

}
