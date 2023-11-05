package com.gradedproject.q2;
import java.util.Scanner;


public class PowerCalculation {
		static int Calculate(int x,int n) 
		{
			if(n==0)
				return 1;
			else 
			{
				return 2* Calculate( x, n-1);
			}

		}

	public static void main(String[] args) 
	{
			Scanner in = new Scanner(System.in);

			System.out.print("Enter the base number X: ");
			int x = in.nextInt();

			System.out.print("Enter the power N: ");
			int n = in.nextInt();

			long result = Calculate(x, n);

			System.out.println("X power N is: " + result);
	}
	
	
}
