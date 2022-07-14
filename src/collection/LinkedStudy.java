package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStudy 
{

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		
		ll.add("Baramati");
		ll.add(123);
		ll.add('A');
		ll.add(null);
		ll.add(null);
		ll.add(12.12);
		ll.add(true);
		
		System.out.println(ll);
		
		System.out.println("======");
		
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll.pop());
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.indexOf(12.12));
		System.out.println(ll.lastIndexOf(12.12));
		System.out.println(ll.add(123));
		System.out.println(ll.clone());
		System.out.println(ll.element());
		System.out.println(ll.contains(123));
		System.out.println(ll);
		
		System.out.println("==========");
		
		//for loop use
		for(int i=0;i<=ll.size()-1;i++)
        {
           System.out.println(ll.get(i));
		}
        System.out.println("=========");
        
       
        
        //for each loop use
        for(Object s:ll)
        {
        	System.out.println(s);
        }

	    System.out.println("======");
	    
	    
	    //ListIterator use
	    ListIterator mm = ll.listIterator();
	      while(mm.hasNext())
	      {
	    	  System.out.println(mm.next());
	      }
	      System.out.println("=========");
	      
	      
	      //Iterator use
	       Iterator op = ll.iterator();
	        while(op.hasNext())
	        {
	        	System.out.println(op.next());
	        }
	         System.out.println("========");
	        
	         
	}       
}
