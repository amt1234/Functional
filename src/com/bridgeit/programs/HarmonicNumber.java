package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class HarmonicNumber {

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=scanner.nextInt();
		
		Utility utility =new Utility();
		utility.harmonic(n);
		//System.out.println();
		
		scanner.close();
	}

}

