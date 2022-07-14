package Constructor;

public class ClassB 
{
   
	 String name;
	   float age;
	   float height;
	   int passedyear;
	   char grade;
	  
	   public ClassB()
	  {
		name="Rohit";
		age=30f;
		height=5.8f;
		passedyear=2011;
		grade='A';
		}
	   public ClassB(String N,float A,float H,int P,char G)
	   {
		name=N;
		age=A;
		height= H;
		passedyear=P;
		grade =G;
		}
	   public static void main(String[] args) 
		{
			ClassB cb=new ClassB();
			cb.studentinfo();
			
			
		}
	   public void studentinfo()
	   {
		   System.out.println("name is "+name);
		   System.out.println("age is "+age);
		   System.out.println("height is "+height);
		   System.out.println("passedyear is "+passedyear);
		   System.out.println("grade is "+grade);
		   }
	   }


