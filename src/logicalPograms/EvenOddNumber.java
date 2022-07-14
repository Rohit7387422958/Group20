package logicalPograms;

import java.util.Scanner;

public class EvenOddNumber 
{

	public static void main(String[] args) 
	{
//		System.out.println(10%2);//0
//        System.out.println(10/2);//5
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int a = sc.nextInt();
		
	    if(a%2==0)
	    {
	    	System.out.println("given number is Even number");
	    }
	    else
	    {
	    	System.out.println("given number is Odd number");
	    }
	
	}

}
