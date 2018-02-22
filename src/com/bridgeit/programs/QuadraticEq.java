package com.bridgeit.programs;
import java.util.*;

import com.bridgeit.utility.Utility;

public class QuadraticEq {

	public static void main(String[] args) 
	{
		int a,b,c;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the a :");
		a=scanner.nextInt();
		System.out.println("Enter the b :");
		b=scanner.nextInt();
		System.out.println("Enter the c :");
		c=scanner.nextInt();
		
		Utility utility=new Utility();
		utility.quadratic(a, b, c);
		scanner.close();
		
	}

}
