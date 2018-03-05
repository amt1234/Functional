package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose:  To find the roots of the equation a*x*x + b*x + c
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class QuadraticEq {

	public static void main(String[] args) 
	{
		int a,b,c;
		Utility utility=new Utility();
		System.out.println("Enter the a :");
		a=utility.inputInteger();
		System.out.println("Enter the b :");
		b=utility.inputInteger();
		System.out.println("Enter the c :");
		c=utility.inputInteger();
		
		utility.quadratic(a, b, c);
		
	}

}
