package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose: prints the Euclidean distance from the point (x, y) to the origin (0, 0)
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Distance {

	public static void main(String[] args) 
	{
		double x;
		System.out.println("enter the x :"+args[0]);
		x=Double.parseDouble(args[0]);
		
		double y;
		System.out.println("enter the y :"+args[1]);
		y=Double.parseDouble(args[1]);
		
		Utility utility=new Utility();
		utility.distance(x, y);
		

	}

}
