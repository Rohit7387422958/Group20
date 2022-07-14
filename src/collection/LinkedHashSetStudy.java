package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetStudy
{

	public static void main(String[] args)
	{
	  LinkedHashSet lh=new LinkedHashSet();
	  lh.add("Pune");
	  lh.add("Pune");
	  lh.add('A');
	  lh.add('B');
	  lh.add(100);
	  lh.add(123);
	  lh.add(12.234);
	  lh.add(null);
	  lh.add(null);
	  lh.add(true);
	  System.out.println(lh);
	  
	  System.out.println(lh.isEmpty());
	  System.out.println(lh.size());
	  System.out.println(lh.contains('B'));
	  System.out.println(lh);
	  System.out.println(lh.remove(100));
	  
	  for(Object m:lh)
	  {
		  System.out.println(m);
		  
	  }
	  System.out.println("========");
	  
	  Iterator op = lh.iterator();
	  while(op.hasNext())
	  {
		  System.out.println(op.next());
		  
	  }
      System.out.println("========");
      
      LinkedHashSet<Integer> lhi=new LinkedHashSet<>();
      lhi.add(90);
      lhi.add(80);
      lhi.add(60);
      lhi.add(40);
      lhi.add(10);
      System.out.println(lhi);
      System.out.println("===========");
      
      LinkedHashSet<Character> abc = new LinkedHashSet<>();  
      abc.add('A');
      abc.add('B');
      abc.add('C');
      abc.add('D');
      
      System.out.println(abc);
  }

}
