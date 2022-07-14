package logicalPograms;

import java.util.Scanner;

public class PalindromeString 
{

	public static void main(String[] args) 
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter a String");
	    String a = sc.next();
	    String b="";
	    
	   for(int i=a.length()-1;i>=0;i--)
	   { 
		  b=b+a.charAt(i);
	   }
	   System.out.println("Original String is "+a);
	   System.out.println("Reverse String is "+b);
	   
	   if(a.equals(b))
	   {
		   System.out.println("String is Palindrome");
	   }
	   else
	   {
		   System.out.println(" String is Not Palindrome");
	   }
	
	}

}
