package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Factorers {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int n;
		System.out.println("enter the number");
		n=scanner.nextInt();
		
		Utility utility =new Utility();
		utility.fact(n);

	}

}
