package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class Powerof2 {

	public static void main(String args[])
	{
		System.out.println("Enter the N "+args[0]);
		int n=Integer.parseInt(args[0]);
		Utility utility =new Utility();
		utility.powerOf2(n);
	}

}
