package collection;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorStudy 
{

	public static void main(String[] args) 
	{
	    Vector v=new Vector();
	    v.add("Pune");
	    v.add('A');
	    v.add("Pune");
	    v.add(null);
	    v.add(null);
	    v.add(12);
	    v.add(1.2);
	    v.add(8654);
	    System.out.println(v.elementAt(1));
	    System.out.println(v.get(1));
	    System.out.println(v);
	    System.out.println(v.remove(1.2));
	    System.out.println(v);
	    System.out.println(v.firstElement());
	    System.out.println(v.lastElement());
	    System.out.println(v.isEmpty());
	    System.out.println(v.capacity());
	    System.out.println(v.clone());
        System.out.println(v.equals(12));
        System.out.println(v.size());
	    
	    System.out.println("==========");
	    
	    for(int i=0;i<=v.size()-1;i++)
	    {
	    	System.out.println(v.get(i));
	    }
	    System.out.println("========");
	    
	    //ListIterator use
		ListIterator lit = v.listIterator();
        while(lit.hasNext())
        {
        	System.out.println(lit.next());
        	
        }
        System.out.println("============");
         
        //Enumeration use
	    Enumeration ve = v.elements();
	    while(ve.hasMoreElements())
	    {
	    	System.out.println(ve.nextElement());
	    }
	    System.out.println("==========");
	    
	    //forEach use
	    for(Object b:v)
	    {
			System.out.println(b);
	    }
	    System.out.println("=======");
	    
	    // Iterator use
	    Iterator h = v.iterator();
	     while(h.hasNext())
	     {
	    	 System.out.println(h.next());
	     }
	     System.out.println("==========");
	
	}

}
