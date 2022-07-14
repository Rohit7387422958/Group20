package pattern;

public class Eg7_Equilateral_Downward {

	public static void main(String[] args) 
	{
//		*******
//		 *****
//		  ***
//		   *
	//space=0;star=7;col=7,row=4
        int space=0;
        int star=7;
        for(int i=0;i<=4;i++)
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
            space++;
            star=star-2;
        
        }
	}

}
