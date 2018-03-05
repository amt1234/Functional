package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose:  Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
 *  	 the National Weather Service defines the effective temperature (the wind chill).

 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

public class Wildchill {

	public static void main(String[] args)
	{
		double v = 0;
		double t = 0;
		System.out.println("enter the v "+args[0]);
		v=Double.parseDouble(args[0]);
		System.out.println("enter the t "+args[1]);
		t=Double.parseDouble(args[1]);
		Utility utility=new Utility();
		utility.windchill(t, v);

	}

}
