package pattern;

public class Eg11_AscDes_IncresingDecreasing {

	public static void main(String[] args) 
	{
		
		//*
		//**
		//***
		//****
		//***
		//**
		//*
		//row=7;star=1;
		int star=1;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
		    System.out.println();
		    if(i<4)
		    {
		    	star++;
		    }
		    else
		    {
		    	star--;
		    }
		    
		
		}
	
	}

}
