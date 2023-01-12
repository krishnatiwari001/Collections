package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_Concept {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		//add
		ll.add("Krishna");
		ll.add("Sachin");
		ll.add("Saubhya");
		ll.add("Ayush");
		
		//Print all
		System.out.println("LinkedList Content"+ll);
		
		//add First
		ll.addFirst("Tiwari");
		
		//add Last
		ll.addLast("Yadav");
		
		//Get
		System.out.println(ll.get(0));
		
		//Set
		System.out.println(ll.set(0, "Rash"));
		
		System.out.println("LinkedList Content"+ll);
		
		//Remove First and Last element
		ll.removeFirst();
		ll.removeLast();
		System.out.println("LinkedList Content after first and last removal "+ll);
		
		//Remove by Index
		ll.remove(0);
		System.out.println("LinkedList Content after 0 index removal "+ll);
		
		//How to print all the value of LinkedList
		//1.For loop
		System.out.println("****Using For loop");
		for(int i=0; i<ll.size(); i++)
		{
			System.out.println(ll.get(i));
		}
		
		//2.Advance For loop
		System.out.println("*********Using Advance Loop");
		for(String str : ll)
		{
			System.out.println(str);
		}
		
		//3.Iterator
		System.out.println("*********Using Iterator");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//4.using While loop
		System.out.println("**********Using While loop");
		
		int num=0;
		while(num<ll.size())
		{
			System.out.println(ll.get(num));
			num++;
		}

	}

}
