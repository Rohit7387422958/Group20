package Constructor;

public class UserDefinedConstructor 
{
   

	  int a;
	  int b;
	  public UserDefinedConstructor()
	  {
		  System.out.println("hi is user defined constructor running");
		  a=900;
		  b=800;
				  
				  
	  }
		
		public static void main(String[] args)
		{
			UserDefinedConstructor ud=new UserDefinedConstructor();
			   ud.add();
			   ud.sub();


		}
	    public void add()
	    {
	    	int sum=a+b;
	    	System.out.println("sum is"+sum);
	    }
	    
	    public void sub()
	    {
	    	int sub=a-b;
	    	System.out.println(sub);
	    }
}
