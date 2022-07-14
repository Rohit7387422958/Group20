package Mehod;

public class TilakUniversity 
{

	public static void main(String[] args)
	{
		TilakUniversity tu=new TilakUniversity();//Created object of the class
		tu.StudentInfo();//calling method without parameter
		tu.StudentInfo("Mahesh","pu564","MBA",2,'C');//calling method with parameter
		
		

	}
	
	public void StudentInfo()//non static method ---->without parameter
	{
		//name ,PRN, course year,grade 
		
		String name="Rohit";
		String PRN="pu12345";
		String course="java";
		char grade='B';
		
		System.out.println("-----------------");
		System.out.println("Student name is   "+name);
		System.out.println("student PRN is  "+PRN);
		System.out.println("Student course is  "+course);
		System.out.println("student grade is  "+grade);
		System.out.println("--------------");
		
		}
	public void StudentInfo(String name,String PRN,String course,int year,char grade )
	//method with parameter
	{
		
		
		System.out.println("-----------------");
		System.out.println("Student name is   "+name);
		System.out.println("student PRN is  "+PRN);
		System.out.println("Student course is  "+course);
		System.out.println("student grade is  "+grade);
		System.out.println("--------------");
		
	}
	}


