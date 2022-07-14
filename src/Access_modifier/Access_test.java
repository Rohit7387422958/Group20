package Access_modifier;

public class Access_test 
{
	 //created class in same package
	public static void main(String[] args)
	{
		Private_use p= new Private_use();//creating object of other class
		  {
			  p.sub();//calling public method of other class within same package---allowed in project
			  
			  //p.add;//calling private method of other class within same package---not allowed in other class
			  
			  p.mul();//calling default method of other class within same package---allowed within package
			  
		Private_use.display();//calling protected method of other class within same package/need inheritance to call another package
		
			  
			  
			  System.out.println("value of a is"+p.a);
			  
			  System.out.println("value of a is"+p.c);
			  
			  System.out.println("value of a is"+p.d);
		  }
	}

	}


