package com.bridgeit.programs;
import com.bridgeit.utility.Utility;

/******************************************************************************

 *  Purpose:Flip Coin and print percentage of Heads and Tails
 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class Flipcoin {

	public static void main(String[] args)
	{
		Utility utility=new Utility();
		int time;
		System.out.println("Enter how many times to coin flip");
		time=utility.inputInteger();
		
		utility.flipcoin(time);

	}

}
