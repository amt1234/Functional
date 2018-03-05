package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************
 *  Purpose:  Simulates a gambler who start with $stake to reach $goal. 
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Gambler {

	public static void main(String[] args) 
	{
		Utility utility =new Utility();
		int stake;
		System.out.println("enter stake");
		stake=utility.inputInteger();
		
		int goal;
		System.out.println("enter goal");
		goal=utility.inputInteger();
		
		int time;
		System.out.println("enter time");
		time=utility.inputInteger();
		
		utility.gambler(stake, goal, time);
		
	}

}
