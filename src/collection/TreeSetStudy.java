package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetStudy 
{

	public static void main(String[] args) 
	{
		TreeSet ts=new TreeSet();
		 ts.add("Pune");
		 ts.add("abc");
		 ts.add("xyz");
		 ts.add("pqr");
		// ts.add(null); not use in null for NullPointerException 
		 
		 System.out.println(ts);
	     System.out.println(ts.isEmpty());
	     System.out.println(ts.contains("abc"));
	     System.out.println(ts.pollFirst());
	     System.out.println(ts);
	     System.out.println(ts.pollLast());
	     System.out.println(ts);
	     
	     System.out.println("==========");
	     
	     Iterator mp = ts.iterator();
	     while(mp.hasNext())
	     {
	    	 System.out.println(mp.next());
	    	 
	     }
	     System.out.println("========");
	     for(Object q:ts)
	     {
	    	 System.out.println(q);
	     }
	     System.out.println("==========");
	}

}
