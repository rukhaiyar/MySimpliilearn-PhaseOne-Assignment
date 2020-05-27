package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the one number : " );
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number : " );
		num2 = sc.nextInt();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("After the swap : num : " + num1 + "  num2 : " + num2);
		sc.close();	
	}

}
