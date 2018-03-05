package com.bridgeit.programs;

import com.bridgeit.utility.Utility;
/******************************************************************************

 *  Purpose:  2D arrays of integers, doubles, or booleans
 *  
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/

public class Twodarray9 {

	public static void main(String[] args) {
		int m;
		int n;
		Utility utility=new Utility();
		System.out.println("Enter the m");
		m =utility.inputInteger();

		System.out.println("Enter the n");
		n = utility.inputInteger();
	
		utility.twodarray(m, n);
	}

}
