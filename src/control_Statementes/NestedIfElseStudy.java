package control_Statementes;

public class NestedIfElseStudy 
{

	public static void main(String[] args) 
	{
		//if UN is valid---->enter PWD
				//if PWD is valid----->login success
				//else PWD is invalid---->incorrect PWD
				//else UN is invalid---->incorrect UN
				 
				String UN="Velocity";
				String PWD="Velocity@123";
				if(UN=="Velocity") //outer loop
				{
					System.out.println("Enter password");
					if(PWD=="Velocity@123")//inner loop
					{
						System.out.println("login success");
					}
					else
					{
						System.out.println("incorrect PWD");
					}
				}
				else
				{
					System.out.println("incorrect UN");
				}
	}

}
