package com.neotech.homeworkduring;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Today is Sunday and we have Java class";

		String str1 = str.replaceAll("a", "e");

		System.out.println(str1);

		System.out.println("-------------------------------");

		String st = "Today is Sunday and we have Java class";

		char[] charArray = st.toCharArray();

		for (char el : charArray) {

			if (el == 'a') {
				el = 'e';

			} else {
				System.out.print(el);
			}

		}
	}

}
