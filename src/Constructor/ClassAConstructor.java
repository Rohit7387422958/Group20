package Constructor;

public class ClassAConstructor 
{
	int a;
	int b;
	int c;
	
	
	public ClassAConstructor()//without parameter
	{
		 a=10;
		 b=20;
		 c=30;
	} 
	public  ClassAConstructor(int x)//single parameter Constructor
	{
		a=x;
	}
	public  ClassAConstructor( int x,int y)//double parameter Constructor
	{
		a=x;
		b=y;
	}
	public ClassAConstructor(int x,int y,int z)//three parameter Constructor
	{
		a=x;
		b=y;
		c=z;
	}
	public static void main(String[] args) 
	{
		ClassAConstructor  cc=new ClassAConstructor(); 
		cc.addition();//calling method zero parameter constructor	
		ClassAConstructor  cc1=new ClassAConstructor(500);
		cc1.addition();//calling method one parameter
		ClassAConstructor  cc2=new ClassAConstructor(400);
		cc2.addition();//calling method two parameter
		ClassAConstructor cc3=new ClassAConstructor(600);
		cc3.addition();//calling method three parameter
	}
	public void addition()
	{
		 int sum=a+b+c;
		System.out.println("addition is   "+sum);
	}
}
	

