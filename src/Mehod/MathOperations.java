package Mehod;

public class MathOperations 
{

	public static void main(String[] args) 
	{
		MathOperations mp=new MathOperations();
		mp.addition();
		mp.sub();
		//
		
		Test1 t1=new Test1();
		t1.mul();
		Test1.div();

}

	 public void addition()//non static regular method
	    {
	   int a=20;
	  int b=40;
	int sum=a+b;
	System.out.println("sum is  "+sum);
	}

	public static void sub()//static regular method
	{
	int p=50;
	int q=70;
	int sub=p-q;
	System.out.println("sub is"+sub);
	}
}


