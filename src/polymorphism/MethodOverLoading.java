package polymorphism;

public class MethodOverLoading {
//Declaring multiple method with same method name but different argument in a same class is called method overloading 
	 public static void main(String[] args) 
		{
			MethodOverLoading m=new MethodOverLoading();
			m.add();
			m.add(12,12);

		}
		public void add()
		{
			int a=10;
			int b=20;
			int sum=a+b;
			System.out.println("addition is "+sum);
			
		}
		public void add(int a,int b)
		{
			int sum=a+b;
			System.out.println("addition is "+sum);
		}
     
	}


