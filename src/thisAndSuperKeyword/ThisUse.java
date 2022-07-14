package thisAndSuperKeyword;

public class ThisUse 
{
	 int a=10;
	   static int b=99;
		public static void main(String[] args) 
		{
			ThisUse tu=new ThisUse();//created object of a class
			tu.test();

		}
		public void test()
		{
			int a=100;//local variable
			System.out.println("local value of a is "+a);
			System.out.println("global value of a is "+this.a);
			
			int add1=1+a;//a value local value
			System.out.println("value of add 1 is "+add1);
			
			//i want to use global value of a
			int add2=1+this.a;
			System.out.println("value of add2 is "+add2);
			//static int b=8;
			
		}
}
