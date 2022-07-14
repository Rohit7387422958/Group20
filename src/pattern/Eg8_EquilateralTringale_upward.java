package pattern;

public class Eg8_EquilateralTringale_upward {

	public static void main(String[] args)
	{
//		   *
//		  ***
//		 *****
//		*******

      //row=4;col=7;star=1;space=3
		int space=3;
		int star=1;
		for(int i=1;i<=4;i++)
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
		    space--;
		    star=star+2;
		}
	}
    
}
