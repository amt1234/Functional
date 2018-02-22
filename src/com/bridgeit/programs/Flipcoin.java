package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Flipcoin {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int time;
		System.out.println("Enter how many times to coin flip");
		time=scanner.nextInt();
		
		
		Utility utility =new Utility();
		utility.flipcoin(time);

	}

}
