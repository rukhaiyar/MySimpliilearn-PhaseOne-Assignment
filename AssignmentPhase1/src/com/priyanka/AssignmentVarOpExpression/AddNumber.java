package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first Number : " );
		int num1 = sc.nextInt();
		System.out.println("Enter the second Number : ");
		int num2 = sc.nextInt();
		sum = num1 + num2;
		System.out.println("The sum of two numbers"+ sum);
		
		sc.close();	
		
	}

}
