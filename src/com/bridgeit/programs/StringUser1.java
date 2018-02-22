package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class StringUser1 {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		String str;
		System.out.println("enter the username");
		str=scanner.next();
		Utility utility =new Utility();
		System.out.println(" "+utility.username(str));
		scanner.close();

	}

}
