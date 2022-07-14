package Inheritance_study;

public class MultilevelInheritance 
{

	public static void main(String[] args) 
	{
		 Son1 s1=new Son1();
	     //object of child class can call all properties
	     s1.keys();//properties of super most class
	     s1.recipe();//properties of super most class
	     s1.home();//properties of super class
	     s1.money();//properties of super class
	     s1.mobile();//properties of own class
	     s1.laptop();//properties of own class
	     
	     
	     
	     System.out.println("===========");
	     
	     Mother1 m1=new Mother1();
	     //object of super class can call own and its super class
	     m1.keys(); //properties of super class
	     m1.recipe();//properties of super class
	     m1.home();//properties of own class
	     m1.money();//properties of own class
	    
	     
	     
	     System.out.println("========");
	     
	     
	     Grandmother gm=new Grandmother();//object super most classes
	       gm.recipe();//can call its own properties only
	       gm.keys();//can call its own properties only
	       
	}

}
