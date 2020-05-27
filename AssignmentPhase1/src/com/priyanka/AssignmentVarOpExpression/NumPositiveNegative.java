package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class NumPositiveNegative {

	public static void main(String[] args) {

		double num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if positive or negative : ");
		num = sc.nextDouble();
		
		String result = (num >= 0) ? "positive" : "negative";
		
		System.out.println(num + " is " + result);
		
		sc.close();	
	}

}
