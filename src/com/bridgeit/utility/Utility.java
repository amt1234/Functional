package com.bridgeit.utility;

import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import com.bridgeit.programs.Twodarray9;

public class Utility {
	String str2;
	Scanner scanner;
	public Utility()
	{
		scanner=new Scanner(System.in);
	}

	// INPUT STRING
	public String inputString() {
		try {
			return scanner.next();
		} catch (Exception e) {
			System.out.println(e);
		}
		return "";
}
	// INPUT Integer
		public int inputInteger() {
			try {
				return scanner.nextInt();
			} catch (Exception e) {
				System.out.println(e);
			}
			return 0;
	}

	/**
	 * @param string
	 * @return replace string result
	 */
	public static String username(String string) 
	{
		String string2 = null;
		if (string.length() >= 3) {
			String string1 = "hello, username how are you.";
			System.out.println(string);
			string2 = string1.replace("username", string);
			// return str2;
		} else {
			System.out.println("Username should be grater than 3 character");
		}
		
		return string2;
	}

	/**
	 * @param year
	 * finding that giver year is leap year or not and year should 4 digit
	 */
	public boolean leapyear(int year) {

		if (Integer.toString(year).length() == 4)
		{
			if((year%4==0)&&(year%100!=0)||year%400==0)
				return true;
			else
				return false;		
		}
	 else 
	 {
		System.out.println("Invalid year");
	 }
	return false;
	}
	
	/**
	 * @param number
	 * @return harmonics of number
	 */
	public float harmonic(int number) {
		float sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + (1 / (float) i);
		}
		return sum;
	}

	/**
	 * @param time
	 * @ Determine filpcoine head and tail
	 */
	public void flipcoin(int time) {
		int count1 = 0;
		int count2 = 0;

		if (time >= 0) {
			for (int i = 0; i < time; i++) {
				System.out.println(Math.random());
				if (Math.random() < 0.5) {
					System.out.println("head");
					count1++;
				} else {
					System.out.println("tail");
					count2++;
				}
			}
		}
		int head = (count1 * 100) / time;
		int tail = (count2 * 100) / time;
		System.out.println("head =" + head + " % vs tail = " + tail + "%");
	}

	/**
	 * @param number
	 * 
	 */
	public void powerOf2(int number) {
		if (number >= 0 && number < 31) {

			for (int i = 0; i < number; i++) {

				int k = (int) Math.pow(2, i);
				System.out.println( "2^"+i+" =" + k);
			}
		} else {
			System.out.println("overflow");
		}
	}

	/**
	 * @param number
	 * Find the prime factorization of N
	 */
	
	public void factor(int number) {
		  int i;
		  for (i = 2; i <= number; i++) {
			  
	            while (number % i == 0) {
	                System.out.print(i + "\n");
	                number= number / i;
	            }
	        }
	 
	        if (number < 1)
	        	System.out.println(number);     
	    }

	/**
	 * @param stake
	 * @param goal
	 * @param time
	 * Simulates a gambler who start with $stake to reach $goal.
	 */
	public void gambler(int stake, int goal, int time) {
		int won = 0, loss = 0, beat = 0;
		
		for (int i = 0; i <time; i++) {
			
			if(stake > 0 && stake< goal) 
			{
				beat++;
				
				if (Math.random() < 0.5) {
					stake++;
					won++;

				} 
				else {
					stake--;
					loss++;
				}
			}
		
		}
		System.out.println("wins" + won);
		System.out.println("loss" + loss);
		System.out.println("Beat" + beat);
		int wins = (won * 100) / beat;
		int los = (loss * 100) / beat;
		System.out.println(wins + "% vs " + los + "%");
		
	}

	/**
	 * @param coupen_number
	 * Determines random coupen number
	 */
	public void coupen(int coupen_number) {
		LinkedHashSet<Integer> randomnumber = new LinkedHashSet<Integer>();
		int count=0;
		for (int i =0 ; i <coupen_number; i++) 
		{
			for(int j=0;j<=i;j++)
			{
			int setvalue=((getRandomNumber(1,coupen_number)));
			count++;
			randomnumber.add(new Integer(setvalue));
			}
		}
		System.out.println(randomnumber + " ");
		System.out.println(count);
	}
	static int getRandomNumber(int min,int max)
	{
		
		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
		
	}

	/**
	 * @param x
	 * @param y
	 * prints the Euclidean distance from the point (x, y) to the origin (0, 0)
	 */
	public void distance(double x, double y) {
		double x1 = Math.pow(x, 2);
		double y1 = Math.pow(y, 2);
		double result = x1 + y1;
		double output = Math.sqrt(result);
		System.out.println("Distance is=" + output);
	}

	
	/**
	 * @param array
	 *  counts the   number of triples that sum to exactly 0.
	 */
	public void triples(int array[]) {
		int i, j, k;
		
		int triplets = 0;
		int nontriplets=0;
		for (i = 0; i < array.length-2; i++) {
			for (j = (i + 1); j < array.length -1; j++) {
				for (k = (j + 1); k < array.length ; k++) {
					int result = array[i] + array[j] + array[k];

					if (result == 0) 
					{
     					System.out.println("triplets are "+array[i]+" "+array[j]+" "+array[k]);
						
						triplets++;
					}
					else
					{
						System.out.println("non triplets are "+array[i]+" "+array[j]+" "+array[k]);
						nontriplets++;
					}

				}
			}
		}

		System.out.println(triplets + " count of triple ," + nontriplets + " count of not triple");

	}

	
	
	/**
	 * @param m for row
	 * @param n for column
	 * TWODARRAY of integers, doubles, or booleans
	 */
	public void twodarray(int m,int n)
	{
		
		PrintWriter printwriter=new PrintWriter(System.out);
		Twodarray9 tt=new Twodarray9();
		
		Integer arrayInt[][] = new Integer[m][n];
		Double arraydouble[][] = new Double[m][n];
		Boolean arrayboolen[][] = new Boolean[m][n];

		printwriter.write("Enter your choice :");
		printwriter.write("1.Integer array\n");

		printwriter.write("2.Double array\n");

		printwriter.write("3.Boolean array\n");
		printwriter.flush();
		int choice = scanner.nextInt();
	
		switch (choice) {
		case 1:
			printwriter.write("Integer array is\n");
			printwriter.flush();

			printwriter.write("Enter the elements\n");
			printwriter.flush();

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arrayInt[i][j] = scanner.nextInt();

				}
			}
			printArray(arrayInt, m, n);
			break;
		case 2:
			printwriter.write("Double array is\n");
			printwriter.flush();

			printwriter.write("Enter the elements\n");
			printwriter.flush();

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arraydouble[i][j] = scanner.nextDouble();

				}
			}
			printArray(arraydouble, m, n);
			break;
		case 3:
			printwriter.write("boolean array is\n");
			printwriter.flush();

			printwriter.write("Enter the elements\n");
			printwriter.flush();

			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					arrayboolen[i][j] = scanner.nextBoolean();

				}
			}
			printArray(arrayboolen, m, n);
			break;

		default:
			printwriter.println("Invalid choice");
			printwriter.flush();
			printwriter.close();
		}
	}
	public static <T> void printArray(T[][] arrays, int rows, int columns) {

		PrintWriter printwriter = new PrintWriter(System.out);
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				printwriter.print(arrays[i][j] + " ");
				printwriter.flush();
			}
			System.out.println();
		}
	}
	
	/**
	 * @param t in Fahrenheit
	 * @param v in miles per hour
	 */
	public void windchill(double t,double v)
	{
		double w;
		if(t>50)
		{
			System.out.println("Invalid range");
		}
		else if(v>120 && v<3)
		{
			System.out.println("Invalid range");
		}
		else
		{
			w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
			System.out.println("w is = "+w);
		}
		
	}
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public void quadratic(int a,int b,int c)
	{
		
		int delta=b*b - 4*a*c;
		System.out.println("delta is : "+delta);
		
		if(delta>0)
		{
			System.out.println("Root are real and unequal");
			double root1=(-b+Math.sqrt(delta))/(2*a);
			double root2=(-b-Math.sqrt(delta))/(2*a);
			System.out.println("Root1 is : "+root1);
			System.out.println("Root2 is : "+root2);
		}
		else if(delta==0)
		{
			System.out.println("Root are real and equal");
			double root1=(-b+Math.sqrt(delta))/(2*a);
			
			System.out.println("Root1 is : "+root1);
				
		}
		else
		{
			System.out.println("Root is imagenary");
		}
	}
	
	
		/**
		 * @param string
		 * @param i
		 * @param j
		 * to return all permutation of a String
		 */
		public void permutation1(String string,int i,int j)
		{
			if(i==j)
			{
				System.out.println(string);
			}
			else
			{
				for(int k=i;k<=j;k++)
				{
					string=strSwap(string,i,k);
					permutation1(string,i+1,j);
					string=strSwap(string,i,k);
				}
			}
			
		}
		public String strSwap(String string1,int first,int second)
		{
			char character[]=string1.toCharArray();
			char temp;
			temp=character[first];
			character[first]=character[second];
			character[second]=temp;
			
			return String.valueOf(character);
		}
	
		/**
		 * @ Stopwatch Program for measuring the time that elapses between the start and end clicks

		 */
	
	
		long start=0;
		long end=0;
		boolean running=false;
		
		public long startMeth()
		{
			this.start=System.currentTimeMillis();
			this.running=true;
			return start;
		}
		
		public long endMeth()
		{
			this.end=System.currentTimeMillis();
			this.running=false;
			return end;
		}
		
		public long getelapes()
		{
			long elapes=0;
			if(running==true)
			{
			elapes=(System.currentTimeMillis()-start);
			}
			else
			{
			elapes=(end-start);
			}
			return elapes;
			
		}
		
		public void tictactoe(int rows,int columns)
		{
			int array[][]=new int[rows][columns];
			for (int i = 0; i < array.length; i++)
			{
				for (int j = 0; j < array.length; j++) 
				{
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
			
		}
}
