package com.bridgeit.programs;
import java.util.*;

import com.bridgeit.utility.Utility;
public class Permutation
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string=scanner.nextLine();
		
		
		int length=string.length();  
		Utility utility=new Utility();
		utility.permutation1(string, 0, length-1);
	}
	
}



