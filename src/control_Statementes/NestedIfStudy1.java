package control_Statementes;

public class NestedIfStudy1 {

	public static void main(String[] args) {
		

		//if UN valid----->enter PWD
		//if PWD invalid---->login success
		//if UN valid---->incorrect UN
		//if PWD invalid--->incorrect PWD+
		
		String UN="Rohit";
		String PWD="rohit@123";
		 if(UN=="Rohit") //outer loop
	   {
			System.out.println("enter pwd");
		 if(PWD=="rohit@123")//inner  loop
		 {
			 System.out.println("eter login sucess");
	     }
		 else 
		 {
			System.out.println("incoorect pwd");
			
		 }
	   }
		 else
		 {
			System.out.println("incoorect un");
		 }
	}

}
