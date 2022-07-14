package Constructor;

public class Class1 
{

	public static void main(String[] args) 
	{
		Class1 c1=new Class1();
		c1.addition();
		c1.sub();
		c1.mul();
		c1.div();

}

      public void addition()
      {
      int a=20;
       int b=20;
     int sum=a+b;
    System.out.println("sum is"+ sum);
      }
     
     
    public void sub()
      {
    	
    	int a=50;
    	int b=30;
    	int sub=a-b;
    	System.out.println("sub is"+ sub);
    	}
    
    
    	public void mul()
    	{
    	int a=50;
    	int b=30;
    	int mul1=a*b;
    	System.out.println("mul is"+ mul1);
    	}

    	
    	
    	public void div()
    	{
    	int a=50;
    	int b=30;
    	int div=a/b;
    	System.out.println("div is"+ div);
    	}

  }



