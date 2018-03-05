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
public class CoupenNo {

	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter how many random numbers do you need to generate distinct coupon number");
		int coupen_number;
		coupen_number=utility.inputInteger();
		
		utility.coupen(coupen_number);
	
	}

}
