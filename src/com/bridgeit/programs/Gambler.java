package com.bridgeit.programs;

import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Gambler {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		int stake;
		System.out.println("enter stake");
		stake=scanner.nextInt();
		
		int goal;
		System.out.println("enter goal");
		goal=scanner.nextInt();
		
		int time;
		System.out.println("enter time");
		time=scanner.nextInt();
		
		 int won = 0,loss = 0;
		   int beat = 0;
		  
		
		Utility utility =new Utility();
		utility.gambler(stake, goal, time);
		scanner.close();
	}

}
