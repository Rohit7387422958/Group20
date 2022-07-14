package collection;

import java.util.PriorityQueue;

public class PriorityQStudy 
{

	public static void main(String[] args) 
	{
		PriorityQueue pq=new PriorityQueue();
		pq.add("abc");
		pq.add("pqr");
		pq.add("xyz");
		pq.add("aaa");
		//pq.add(100); not use in ClassCastException
		
		System.out.println(pq);
		
		System.out.println(pq.element());
		System.out.println(pq.poll());
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		System.out.println(pq.poll());
		
		System.out.println("remmove method"+pq.remove());
		pq.poll();
		pq.poll();
		
		System.out.println(pq);
		pq.remove();
		//pq.poll();
		//pq.remove();
	    pq.poll();
		
		System.out.println(pq);
		

	}

}
