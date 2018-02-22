package com.bridgeit.programs;
import java.util.*;

import com.bridgeit.utility.Utility;
public class CoupenNo {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter how many random numbers do you need to generate distinct coupon number");
		int coupen_no;
		coupen_no=scanner.nextInt();
		
		Utility utility =new Utility();
		utility.coupen(coupen_no);
		
		scanner.close();
		
		

	}

}
