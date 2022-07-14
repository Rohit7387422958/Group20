package StringClassStudy;

public class StringUse1 
{

	public static void main(String[] args) 
	{
		String name="Velocity";//with-out using new keyword
		String city=new String("Pune");//with using new keyword
		
		//length() method use
		
		System.out.println(name.length());
	    System.out.println(city.length());
	    
	    int output = name.length();//string output in reference variable
	    System.out.println("length of string is "+output);//we can reuse reference variable
	    System.out.println("================");
	    
	    //toUppercase()method use
	    
	    String a="velocity";
	    
	    System.out.println(a);
	    System.out.println(a.toUpperCase());
	    String b=a.toUpperCase();
	    System.out.println("============");
	   
	    //toLowercase()method use
	    
	    System.out.println(b);
	    System.out.println(b.toLowerCase());
	    String c=b.toLowerCase();
	    System.out.println(c);
	    System.out.println("============");
	    
	    //equals()method study
	    
	    String a1="Velocity";
	    String a2="Velocity";
	    String a3=new String("velocity");
	    String a4=new String("velocity");
	    String a5=new String("velocity");
	    
	    
	    //==will compare memory location that will compare string content
	    System.out.println(a1==a2);
	    System.out.println(a1==a3);
	    System.out.println(a3==a4);
	    
	    //euales will compare content of string
	    System.out.println("=========");
	    System.out.println(a1.equals(a2));
	    System.out.println(a1.equals(a3));
	    System.out.println(a1.equals(a4));
	    System.out.println(a3.equals(a2));
	    System.out.println("===========");
	    System.out.println(a1.equals(a5));
	    System.out.println("==========");
	    
	     //eualesInogrecase()method use
	    System.out.println(a1.equalsIgnoreCase(a5));
	    System.out.println("==========");
	    
	    //contains()method use
	    
	    String b1="Velocity";
	    System.out.println(b1.contains("lo"));
	    boolean result = (b1.contains("lo"));
	    System.out.println("Result "+result);
	    
	    System.out.println(b1.contains("city"));
	    System.out.println(b.contains("v"));
	    System.out.println("==========");
	    
	    //isEmpty()method use
	    
	    String m="pune";
	    String n="";
	    String o=" ";
	    String p=null;
	    System.out.println(m.length());
	    System.out.println(n.length());
	    System.out.println(o.length());
	    //System.out.println(p.length());
	    System.out.println(m.isEmpty());
	    System.out.println(n.isEmpty());
	    System.out.println(o.isEmpty());
	    System.out.println("=========");
	    
	     //charAt()method use
	    
	    String P ="INDIA";
	    System.out.println(P.charAt(3));
	    System.out.println(P.charAt(2));
	    char requiredchar=P.charAt(1);
	    System.out.println(requiredchar);
	    //System.out.println(p.charAt(-1));
	    //System.out.println(p.charAt(9));
	    System.out.println("=============");
	    
	    //ends()method use
	    
	    String w="Baramati";
	    String q="City";
	    System.out.println(w.endsWith("ti"));
	    System.out.println(q.endsWith("ty"));
	    System.out.println(w.endsWith("at"));
	    System.out.println(w.endsWith("cy"));
	    System.out.println("=============");
	    
	    
	    System.out.println(w.startsWith("Ba"));
        System.out.println(q.startsWith("Ci"));
        System.out.println(w.startsWith("ara",1));
        System.out.println("============");
        
        //substring()method use
        String test="My Country India";
        System.out.println(test.substring(3));
        System.out.println(test.substring(11));
        System.out.println(test.substring(0));
        String str =test.substring(2);
        System.out.println(str);
        
        System.out.println(test.substring(3,10));
        System.out.println("================");
        
        //Connect()method use
        
        String x="Pune";
        String y="City";
        System.out.println(x.concat(y));
        System.out.println(x.concat("").concat(y));
        System.out.println("============");
        
        //indexOf method use
        
        String h="INDIADDAAI";
        System.out.println(h.indexOf('A'));
        System.out.println(h.indexOf('I'));
        System.out.println(h.indexOf('I',4));
        System.out.println(h.indexOf('D'));
        System.out.println("============");
        
        //replace method use
        
        String j="Automation Testing";
        System.out.println(j.replace('t', 'm'));
        System.out.println(j.replace("ti", "aa"));
        System.out.println(j.replaceAll("Automation Testing", y));
        System.out.println(j.replaceFirst("Au", "Te"));
        System.out.println("============");
	}
	    
} 	    
	    
	    
	    
	    
	    
      
	
