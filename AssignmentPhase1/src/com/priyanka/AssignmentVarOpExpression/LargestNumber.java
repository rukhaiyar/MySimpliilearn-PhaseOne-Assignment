package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the 2nd number : ");
		num2 = sc.nextInt();
		
		System.out.println("Enter the 3rd number : ");
		num3 = sc.nextInt();
		
		int result = num3 > (num1>num2 ? num1: num2) ? num3 : ((num1 > num2) ? num1 : num2);
		
		System.out.println("Largest number : " +result);
		
		/*if((num1 > num2) && (num1 > num3)) {
			System.out.println("Largest number : " + num1);
		}else if(num2 > num3) {
			System.out.println("Largest number : " + num2);
		}else {
			System.out.println("Largest number : " + num3);
		}*/
		sc.close();
		
	}

}
