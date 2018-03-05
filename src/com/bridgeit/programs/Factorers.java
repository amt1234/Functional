package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose: Find the prime factorization of N
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Factorers {

	public static void main(String[] args) {
		
		int number;
		Utility utility =new Utility();
		System.out.println("enter the number");
		number=utility.inputInteger();
		utility.factor(number);
	}

}
