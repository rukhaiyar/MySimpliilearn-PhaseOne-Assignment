package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class Fahrenheit_Centigrade {

	public static void main(String[] args) {
		double fahrenheit, centigrade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit : ");
		fahrenheit = sc.nextDouble();
		centigrade = (fahrenheit - 32) * (0.5556);
		System.out.println("Temperature in centigrade : " + centigrade);
		sc.close();	
	}

}
