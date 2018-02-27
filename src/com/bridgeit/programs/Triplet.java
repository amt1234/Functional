package com.bridgeit.programs;

import java.util.Scanner;

//import java.util.Scanner;

import com.bridgeit.utility.Utility;

public class Triplet {

	public static void main(String[] args)
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the lenght of array");
		int length=scanner.nextInt();
		System.out.println("enter the elements in array");
		int array[]=new int[length];
		for (int i = 0; i < array.length; i++) 
		{
			array[i]=scanner.nextInt();
		}
		Utility.triples(array);
		

	}

}
