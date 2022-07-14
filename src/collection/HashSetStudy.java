package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudy 
{

	public static void main(String[] args) 
	{
	    HashSet hs=new HashSet();
	    hs.add("Pune");
	    hs.add("Pune");
	    hs.add(null);
	    hs.add(null);
	    hs.add('A');
	    hs.add(12.12);
	    hs.add(123);
	    
	    System.out.println(hs);
	    
	    System.out.println("===========");
	   
	    System.out.println(hs.contains("Pune"));
	    System.out.println(hs.size());
	    System.out.println(hs.isEmpty());
	    System.out.println(hs.clone());
        System.out.println(hs);  
	   
	    System.out.println("==========");
	    
	    //for each use
	   for(Object q:hs)
	   {
		   System.out.println(q);
	   }
	   System.out.println("==========");
	   
	   
	   //Iterator use
	   
	   Iterator op = hs.iterator();
	    while(op.hasNext())
	    {
	    	System.out.println(op.next());
	    }
	    System.out.println("============");
	    
	    //Integer use
	    HashSet<Integer>as=new HashSet<>();
	    as.add(10);
	    as.add(12);
	    as.add(8);
	    as.add(6);
	    as.add(4);
	    System.out.println(as);
	    
	    System.out.println("=========");
	    
	    //Character use
	    HashSet<Character>rg=new HashSet<>();
	    rg.add('A');
	    rg.add('B');
	    rg.add('C');
	    rg.add('D');
	    rg.add('E');
	    System.out.println(rg);
	    
	    System.out.println("===========");
	
	    
	
	
	}   
}
