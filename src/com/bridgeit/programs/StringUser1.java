package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/******************************************************************************
  
 *  Purpose: User Input and Replace String Template “Hello <<UserName>>, How are you?” 
 *
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class StringUser1 {
	
	public static void main(String[] args) 
	{
		String string;
		Utility utility =new Utility();
		System.out.println("enter the username");
		string=utility.inputString();
		
		System.out.println(" "+Utility.username(string));
		
	}

}
