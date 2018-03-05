package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose: Prints the Nth harmonic number
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

public class HarmonicNumber {

	public static void main(String[] args) {

		int number;
		Utility utility =new Utility();
		System.out.println("enter the number");
		number=utility.inputInteger();
		
		System.out.println(utility.harmonic(number));
		
	}

}

