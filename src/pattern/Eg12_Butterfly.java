package pattern;

public class Eg12_Butterfly {

	public static void main(String[] args) 
	{
		//*         *
		//**       **
		//***     ***
		//****   **** 
		//***** *****
		//****   ****
		//***     ***
		//**       **
		//*         *
		
		int star=1;
		int space=5;
		int star2=1;
		int space2=4;
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
		    for(int j=1;j<=space;j++)
		    {
		    	System.out.print(" ");
		    }
		    for(int j=1;j<space2;j++)
		    {
		    	System.out.print(" ");
		    }
		    for(int j=1;j<=star2;j++)	
		    {
		    	System.out.print("*");
		    }
		    if(i<5)
		    {
		    	star++;
		    	space--;
		    	star2++;
		    	space2--;
		    }
		    else
		    {
		    	star--;
		    	space++;
		    	star2--;
		    	space2++;
		    }
		   System.out.println();
		
		}
	

	}

}
