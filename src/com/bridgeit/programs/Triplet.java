package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose: Determines whether or not triplets by counting the number of triples that sum to exactly 0.
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Triplet {

	public static void main(String[] args)
	{
		
		Utility utility=new Utility();
		System.out.println("enter the lenght of array");
		int length=utility.inputInteger();
		System.out.println("enter the elements in array");
		int array[]=new int[length];
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=utility.inputInteger();
		}
		utility.triples(array);
		

	}

}
