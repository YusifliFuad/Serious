package com.neotech.Homework;

public class TaskHome1 {

	public static StringBuffer reversed(String str) {

		StringBuffer sb = new StringBuffer(str);
		return sb.reverse();

	}

	public static void main(String[] args) {

		TaskHome1 tsk1 = new TaskHome1();

		System.out.println(TaskHome1.reversed("Fuad"));

	}

}
