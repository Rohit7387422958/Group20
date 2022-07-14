package MethodStudy;

public class StaticStudy 
{

	public static void main(String[] args) 
	{
		sample();//calling static regular method from same class--->method name(); 
		
		   StaticStudy.display();//calling static regular method form another class
		   
		   StaticStudy.myMethod();//calling static regular method from another class--->classname.methodname();
			}
			
			public static void sample()
			{
			System.out.println("regular static method ");	
			}
		public static void display()
		{
			System.out.println("i am regular static method in static study");
			}
		public static void myMethod()
		{
		System.out.println("i am static regular static method of study class");
		}
	}


