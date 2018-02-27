package com.bridgeit.programs;
import java.util.*;

import com.bridgeit.utility.Utility;
public class CoupenNo {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many random numbers do you need to generate distinct coupon number");
		int coupen_number;
		coupen_number=scanner.nextInt();
		
		

		Utility utility=new Utility();
		Utility.coupen(coupen_number);
		scanner.close();
		
		

	}

}
