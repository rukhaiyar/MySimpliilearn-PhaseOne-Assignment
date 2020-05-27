package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class SwapWithTwoVariable {

	public static void main(String[] args) {

		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		num2 = sc.nextInt();
		
		sc.close();
		
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("after the swap : num1 : " + num1 + " num2 : " +num2);
		
	}

}
