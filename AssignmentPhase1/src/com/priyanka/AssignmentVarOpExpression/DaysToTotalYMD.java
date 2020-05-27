package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class DaysToTotalYMD {

	public static void main(String[] args) {

		int m, year, months=0, days;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of days : ");
		m = s.nextInt();
		s.close();
		
		year = m/365;
		m = m % 365;
		months = m/12;
		
		days = m%12;
		m = days;
		
		System.out.println(year +"Years, " + months +"months,  " + days +" days ");
		
	}

}
