package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {

		int num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check if it is odd and even. :");
		num = sc.nextInt();
		
		String result = (num % 2 == 0) ? "even" : "odd";
		System.out.println(num + " is" + result);
		sc.close();	
		
	}

}
