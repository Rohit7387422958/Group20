package typesOfVariables;

public class HrPortal 
{

	public static void main(String[] args) 
	{
		Employee SachinT=new Employee();//object is created
		SachinT.emp_name="sachin Tendulker";
		SachinT.emp_dept="batting";
		SachinT.emp_id=10;
		SachinT.emp_sal=123.456f;
		SachinT.emp_grade='A';
		SachinT.emp_info();
		
		
		Employee ViratK=new Employee();
		ViratK.emp_name="Virat Kholi";
		ViratK.emp_dept="batting";
		ViratK.emp_id=18;
		ViratK.emp_sal=10000;
		ViratK.emp_grade='A';
		ViratK.emp_info();
		
     }
 
}



