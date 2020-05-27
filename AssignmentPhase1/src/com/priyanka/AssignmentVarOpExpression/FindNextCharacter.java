package com.priyanka.AssignmentVarOpExpression;

import java.util.Scanner;

public class FindNextCharacter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a character : ");
		char inputChar = sc.next().charAt(0);
		sc.close();
		
		System.out.println("The next character is : ");
		
		int ASCI_CODE = (int)inputChar; //typecast char to int
		
		ASCI_CODE = (ASCI_CODE + 1) %128;  //Ascii code range is 0 tp 127
		
		if(ASCI_CODE < 32) {
			ASCI_CODE += 32;
		}
		
		System.out.println((char)ASCI_CODE);
		
		
		
	}

}
