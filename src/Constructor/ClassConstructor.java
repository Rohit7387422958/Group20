package Constructor;

public class ClassConstructor
{
    
	  int p;
	  int y;
	  public ClassConstructor()
	  {
		  System.out.println("he is class constructor");
		  p=20;
		  y=20;
	  }
		
		public static void main(String[] args) 
		{
			ClassConstructor cc=new ClassConstructor();
	            cc.mul();
	            cc.div();

		}
		public void mul()
		{
			int mul1=p*y;
			System.out.println("mul is"+mul1);
		}
		public void div()
		{
			int div=p/y;
			System.out.println("div is"+div);
		}
		
		

}
