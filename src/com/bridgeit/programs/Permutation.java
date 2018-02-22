package com.bridgeit.programs;
import java.util.*;

import com.bridgeit.utility.Utility;
public class Permutation
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scanner.nextLine();
		
		Utility utility=new Utility();
		int n=str.length();
		
		utility.permutation1(str,0,n-1);
	}
	
}



