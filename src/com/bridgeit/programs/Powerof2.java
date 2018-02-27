package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Powerof2 {

	public static void main(String args[])
	{
		System.out.println("Enter the N "+args[0]);
		int number=Integer.parseInt(args[0]);
		Utility.powerOf2(number);
	}

}
