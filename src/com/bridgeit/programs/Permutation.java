package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose: Print static functions to return all permutation of a String using iterative method and 
 *  		Recursion method.
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Permutation
{
	public static void main(String[] args)
	{
		Utility utility =new Utility();
		System.out.println("Enter the String : ");
		String string=utility.inputString();
		
		int length=string.length();  
		utility.permutation1(string, 0, length-1);
	}
	
}



