package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Distance {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		double x;
		System.out.println("enter the x");
		x=scanner.nextInt();
		
		double y;
		System.out.println("enter the y");
		y=scanner.nextInt();
		
		Utility utility =new Utility();
		utility.distance(x, y);
		

	}

}
