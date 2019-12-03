package com.assignment.nov22;


/**
 * @author 799197
 *  Find prime numbers between 1 to 100. 
 */
public class Prime {
	static void findprime(int num)
	{ 
	  int flag=0;
	  for(int i=2; i<num; i++)
	  {
		  if(num%i==0)
			  flag=1;
	  }
	  if(flag==0)
		  System.out.println(num);
	}

	public static void main(String[] args) 
	{
		
		
		for(int num=2;num<=100;num++)
		{
		findprime(num);
	}}

}
