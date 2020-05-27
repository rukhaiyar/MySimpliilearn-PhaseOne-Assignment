package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
	float principle, rate, year;
	float simpleInterest = 0;
	
	Scanner s = new Scanner(System.in);
	System.out.println("Principle: ");
	principle = s.nextFloat();
	
	System.out.println("Rate : ");
	rate = s.nextFloat();
	
	System.out.println("Year: ");
	year = s.nextFloat();
	
	simpleInterest = (principle * rate * year)/100;
	
	System.out.println("Simple Interest : "+ simpleInterest);
	s.close();	
		
	}

}
