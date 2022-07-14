package logicalPograms;

import java.util.Scanner;

public class ReverseString
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=sc.next();//orignal string
		String b="";
		 
		   for(int i=a.length()-1;i>=0;i--)
		   { 
			  b=b+a.charAt(i);
		   }
		   System.out.println("Original String is "+a);
		   System.out.println("Reverse String is "+b);
	
	}

}
