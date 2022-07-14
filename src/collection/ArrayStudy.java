package collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayStudy 
{

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList();
        a.add("Pune");
        a.add('A');
        a.add(123);
        a.add(true);
        a.add(null);
        a.add(null);
        a.add(123.123);
        a.add("pune");
        a.add(123);
        
        System.out.println(a);
        System.out.println(a.size());;
        System.out.println(a.isEmpty());
        System.out.println(a.contains(123));
        System.out.println(a.get(1));
        System.out.println(a.indexOf("Pune"));
        System.out.println(a.lastIndexOf("Pune"));
        System.out.println(a.remove(1));
        System.out.println(a);
	    //for loop use
	     for(int i=0;i<=a.size()-1;i++)
	     {
	    	 System.out.println(a.get(i));
	     }
	     System.out.println("=========");
	     
	     
	     // Iterator use
	     Iterator it = a.iterator();
	     while(it.hasNext())
	     {
	    	 System.out.println(it.next());
	     }
	     System.out.println("=========");
	    
	     //ListIterator use
	     ListIterator mp = a.listIterator();
	     while(mp.hasNext())
	     {
	    	 System.out.println(mp.next());
	     }
	      System.out.println("=========");
	      
	      //ForEach loop use
	      for(Object c:a)
	      {
	    	  System.out.println(c);
	      }
	      System.out.println("=========");
	      
	      //Integer use
	      ArrayList<Integer> ab=new ArrayList<>();
	      
	      ab.add(12);
	      ab.add(10);
	      ab.add(8);
	      ab.add(6);
	      ab.add(4);
	      System.out.println(ab);
	      for(Integer k:ab)
	      {
	    	  System.out.println(k);
	      }
	      System.out.println("==========");
	      
	      //Character use
	      ArrayList<Character> mn=new ArrayList<>();
	      
	      mn.add('A');
	      mn.add('B');
	      mn.add('C');
	      mn.add('D');
	      mn.add('E');
	      mn.add('F');
	      System.out.println(mn);
	      for(Character o:mn)
	      {
	    	  System.out.println(o);
	      }
	      System.out.println("=========");
	
	
	
	}
	

}
