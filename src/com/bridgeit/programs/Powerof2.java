package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose: Find the power of 2 of given number
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Powerof2 {

	public static void main(String args[])
	{
		Utility utility =new Utility();
		System.out.println("Enter the N "+args[0]);
		int number=Integer.parseInt(args[0]);
		utility.powerOf2(number);
	}

}
