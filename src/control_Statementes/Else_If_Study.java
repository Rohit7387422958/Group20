package control_Statementes;

public class Else_If_Study 
{

	public static void main(String[] args) 
	{
		//if marks>=60--->you are dist
				//else if marks>=50--->1st class
				//else if marks>=40--->pass
				//else you are fail
				
				int marks=400;
				if(marks>=60) {
					System.out.println("you are dist");
				}
				else if(marks>=50) {
					System.out.println("you are 1st class");
				}
				else if (marks>=40) {
					System.out.println("you are pass");
					
				}
				else if(marks<40) {
					System.out.println("you are fail");
				}
				//else
				//{
				//	System.out.println("you are fail");
				//}



	}

}
