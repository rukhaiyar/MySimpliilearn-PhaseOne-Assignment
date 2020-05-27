package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class IntegerToNotes {

	public static void main(String[] args) {

		int amountInt;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the amount you wish to convert : ");
		amountInt = sc.nextInt();
		
		int[] Rs= {1000, 500, 100, 50, 20, 10, 5, 2, 1};
		
		int copy = amountInt;
		int totalNotes = 0 ,count = 0;
		
		System.out.println("\n Rs Ominations : \n");

		//check for notes
		for(int i = 0; i < Rs.length; i++) {
			
			//count the number of notes
			count = amountInt/Rs[i];
			if(count !=0) {
				System.out.println(Rs[i] + "\tx\t" + count + "\t= "+ Rs[i]*count);
			}
			totalNotes = totalNotes + count;
			amountInt = amountInt%Rs[i];
		}
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Total \t\t\t = " + copy);
		
		System.out.println("--------------------------------------------------");
		
		System.out.println("Total Number of Notes = \t" +totalNotes );
		sc.close();
	}

}
