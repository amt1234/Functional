package com.bridgeit.programs;


/******************************************************************************
  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/
public class Bubble {

	public static void main(String[] args) {
		int a[]= {5,1,6,2,4,3};
		int temp=0,i;
		
		for(i=0;i<6;i++)
		{
			for(int j=0;j<6-i-1;j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					//System.out.print(a[i]+" ");
				}
				
			}
			System.out.print(a[i]+" ");
			
		}
		
	}

}
