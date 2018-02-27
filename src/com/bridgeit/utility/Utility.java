package com.bridgeit.utility;

import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;

import com.bridgeit.programs.Twodarray9;



public class Utility {
	String str2;
	

	/**
	 * @param string
	 * 
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
	 * if divisible by 4,100 then should divisible by 400 
	 * if 4  but not 100 
	 * if 4 but not 100,400
	 */
	public static void leapyear(int year) {

		if (Integer.toString(year).length() == 4)
		{
			if(year%4==0)
			{
				if(year%100==0)
				{
					if(year%400==0)
					{
						System.out.println("year is leap year");
					}
					else
					{
						System.out.println("not leap year");
					}
				}
				else
				{
					System.out.println("leap year");
				}
			}else
			{
				System.out.println("not leap year");
				
			}
		}
	 else 
	 {
		System.out.println("Invalid year");
	 }
	
	}
	
	/**
	 * @param number
	 */
	public static float harmonic(int number) {
		float sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + (1 / (float) i);
		}
		return sum;
	}

	/**
	 * @param time
	 */
	public static void flipcoin(int time) {
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
	 */
	public static void powerOf2(int number) {
		if (number >= 0 && number < 31) {
			//int result = (int) Math.pow(2, number);

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
	 */
	public static int fact(int number) {
		int facts = 1;
		for(int i=1;i<=number;i++)
		facts = facts * i;
		return facts;
	}

	/**
	 * @param stake
	 * @param goal
	 * @param time
	 */
	public static void gambler(int stake, int goal, int time) {
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
	 */
	public static void coupen(int coupen_number) {
		LinkedHashSet<Integer> randomnumber = new LinkedHashSet<Integer>();
		int setvalue;
		Random r = new Random();
		for (int i = 1; i <= coupen_number; i++) {

			setvalue = r.nextInt(coupen_number);
			randomnumber.add(new Integer(setvalue));

		}
		System.out.println(randomnumber + " ");
	}

	/**
	 * @param x
	 * @param y
	 */
	public static void distance(double x, double y) {
		double x1 = Math.pow(x, 2);
		double y1 = Math.pow(y, 2);
		double result = x1 + y1;
		double output = Math.sqrt(result);
		System.out.println("Distance is=" + output);
	}

	
	/**
	 * @param array
	 */
	public static void triples(int array[]) {
		int i, j, k;
		
		int triplets = 0;
		int nontriplets=0;
		for (i = 0; i < array.length-2; i++) {
			for (j = (i + 1); j < array.length -1; j++) {
				for (k = (j + 1); k < array.length ; k++) {
					int result = array[i] + array[j] + array[k];

					if (result == 0) {
						/*array[i] = array[j];
						array[j] = array[k];
						//found = true;
*/						System.out.println("triplets are "+array[i]+" "+array[j]+" "+array[k]);
						
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

		
			//System.out.println("no triplet found.....");
	}

	
	
	/**
	 * @param m for row
	 * @param n for column
	 * TWODARRAY 
	 */
	public static void twodarray(int m,int n)
	{
		
		PrintWriter printwriter=new PrintWriter(System.out);
		Twodarray9 tt=new Twodarray9();
		
		Scanner scanner=new Scanner(System.in);
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
	 * @param t
	 * @param v
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
	
	
		
	//permutation
	
		/**
		 * @param string
		 * @param i
		 * @param j
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
	
	
	
	//stopWtch
	
	
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
		
	
	
	

		
	
}
