package abstractClass;

public class CC extends Sample
{

	public static void main(String[] args) 
	{
		CC c=new CC();//created object on concrete class
		c.test();//method for sample class
		c.test1();//method for CC
		c.demo();//own method form CC
	}
	public void test1()
	{
		System.out.println("this is completed in concreate class");
	}
	
	public void demo()
	{
		System.out.println("method for CC");
	}
	//public abstract demo1();

	}


