package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

/******************************************************************************

 *  Purpose: Write a Program to play a  Tic-Tac-Toe Game. 
 *  		Player 1 is the Computer and the Player 2 is the user.

 *  @author  Poonam
 *  @version 1.0
 *  @since   05-03-2018
 *
 ******************************************************************************/
public class TicTacToe {

	public static void main(String[] args)
	{
		Utility utility=new Utility();
		System.out.println("Enter the rows:");
		int rows=utility.inputInteger();
		System.out.println("Enter the columns: ");
		int columns=utility.inputInteger();
		utility.tictactoe(rows, columns);
	
	}

}
