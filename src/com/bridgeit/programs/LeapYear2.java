package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class LeapYear2 {
public static void main(String args[])
{
	Scanner scanner=new Scanner(System.in);
	int year;
	System.out.println("enter the year");
	year=scanner.nextInt();
	
	
	Utility utility =new Utility();
	utility.leapyear(year);
	
	scanner.close();
}
}
