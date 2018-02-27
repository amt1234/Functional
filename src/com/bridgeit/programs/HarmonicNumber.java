package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int number;
		System.out.println("enter the number");
		number=scanner.nextInt();
		
		System.out.println(Utility.harmonic(number));
		//System.out.println();
		
		scanner.close();
	}

}

