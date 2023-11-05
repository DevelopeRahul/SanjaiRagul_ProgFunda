package com.gradedproject.q2;

public class RecursiveFunction  
{
	

	static int recfun(int x,int n) 
	{
		if(n==0)
			return 1;
		else 
		{
			return 2* recfun( x, n-1);
		}

	}

	public static void main(String[] args) 
	{
		System.out.println(recfun(2,2));	
	}



}






