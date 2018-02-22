package com.bridgeit.programs;

import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Twodarray9 {

	public static void main(String[] args) 
	{
		int m;
		int n;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the m");
		m=scanner.nextInt();
		
		System.out.println("Enter the n");
		n=scanner.nextInt();
		
		Utility utility=new Utility();
		utility.twodarray(m, n);
		
	/*	public static <T> void printArray(T[] t)
		{
			for(int i=0;i<t.length;i++)
			{
				printwriter.write(t[i]+" ");
			}
			printwriter.println();
			
		}*/
		
		scanner.close();
	}

}
