package Casting;

public class UpCasting 
{

	public static void main(String[] args) 
	{
		Father f=new Father();
		   f.car();
		   f.bike();
		
		System.out.println("=============");
  
  Son s=new Son();
      s.car();
      s.bike();
      s.education();
      
      System.out.println("===========");
      
      Father f1=new Son();//upCasting
      f1.bike();
      f1.car();

	}

}
