package com.bridgeit.programs;

import com.bridgeit.utility.Utility;

public class StopWatch {
	
	

	public static void main(String[] args) 
	{
		
		Utility utility=new Utility();
		
		
		System.out.println("start time : "+utility.startMeth());
		for (int i = 0; i <1000000; i++)
		{
			int count=i;
			System.out.println(count);
		}
		System.out.println("end time : "+utility.endMeth());
		System.out.println("elapes time : "+utility.getelapes());
		
		
		
		
	}

}
