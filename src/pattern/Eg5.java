package pattern;

public class Eg5 {

	public static void main(String[] args)
	{
		//  *
		//  **
        //  ***
		//  ****
	    //  *****
	   //row --->5,col-->5,star-->1,space-->4
		int star=1;
		int space=4;
		for(int i=1;i<=5;i++)//row
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
		     for(int j=1;j<=star;j++)
		     {
		    	 System.out.print("*");
		     }
		     System.out.println();
		     star++;
		     space--;
		}
	
	}

}
