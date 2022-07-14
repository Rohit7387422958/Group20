package FinalKeyword_use;

public class ClassTest
{
	 int a=100;
	 final int b=10;

	public static void main(String[] args) 
	{
		ClassTest t=new ClassTest();
		t.add();
		
	}
	public void add()
	{
		a=a+10;
		System.out.println(a);
		//b=b+10;we can't update value of final variable
	
	}

}
