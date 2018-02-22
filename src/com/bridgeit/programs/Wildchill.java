package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

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
