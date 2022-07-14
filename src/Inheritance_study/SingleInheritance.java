package Inheritance_study;

public class SingleInheritance 
{

	public static void main(String[] args) 
	{
		Mother m=new Mother();
		m.home();
		m.money();
		System.out.println("============");
		
		
		Son s=new Son();
		//creating object child class
		s.money();//using superclass property
		s.home();//using superclass property
		s.laptop();//using own property
		s.mobile();//using own property 
		
	}
	
	}


