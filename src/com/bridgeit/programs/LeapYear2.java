package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose: Determines whether or not year is leap
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class LeapYear2 {
public static void main(String args[])
{
	Utility utility=new Utility();
	int year;
	System.out.println("enter the year");
	year=utility.inputInteger();
	
	System.out.println(utility.leapyear(year));
	
}
}
