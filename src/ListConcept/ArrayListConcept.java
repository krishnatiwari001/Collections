package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		//ArrayList is Dynamic array
		//it can contain duplicate values
		//it maintians insertion order(0,1,2,3,4,5,6)
		//it is not synchronized that is why it is slow compare to other collections
		//its allow randome access to fetch value because it stores the value on the basis of indexes
		ArrayList ar = new ArrayList();//ArrayList is class and this is non generic 
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());//it will give size or array
		
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());//size of ArrayList
		System.out.println(ar.get(4));//To get value from an index
		
		//To print all values from ArrayList
		//1. For loop
		//2. Iterator
		for(int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		
		//non generic vs generic 
		//before JDK1.5 generic is not supported bye java but after 1.5 it is supporting generic
		ArrayList<Integer> ar1 = new ArrayList<Integer>();//This is Integer generic ArrayList
		ar1.add(100);
		//ar1.add("Selenium")//this is not allowed
		
		ArrayList<String> ar2 = new ArrayList<String>();//This is String generic ArrayList
		ar2.add("Selenium");
		
		ArrayList<E> ar3 = new ArrayList<E>();//This is generic ArrayList to store all kind of data
		//Q- how i can store user define class value inside the ArrayList
		//Below till iterator is answer
		//Employee class object
		Employee e1 = new Employee("Krishna",32,"QA");
		Employee e2 = new Employee("Sachin",25,"Dev");
		Employee e3 = new Employee("Aman",18,"Admin");
		
		ArrayList<Employee> ar4 = new ArrayList<Employee>();//This is Class or Employee generic ArrayList
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse the values:
		Iterator<Employee> it = ar4.iterator();//iterator is a method
		//Storing Employee object in Iterator that is why i can use While loop 
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.Dept);
		}
		
		//**************************************
		System.out.println("**************************");
		//addAll() method this we can use to add two ArrayList
		
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Krishna");
		ar5.add("Nand");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Tiwari");
		ar6.add("Mumbai");
		
		ar5.addAll(ar6);
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
				
		//**************************************
		System.out.println("****************************");
		//removeAll() method to remove added ArrayList
		ar5.removeAll(ar6);
		
		for(int i=0;i<ar5.size();i++)
		{
			System.out.println(ar5.get(i));
		}
		
		//*************************************************
		System.out.println("*******************************");
		//retainAll() Method we can use to get common value within 2 ArrayList
		ArrayList<String> ar7 = new ArrayList<String>();
		ar7.add("Selenium");
		ar7.add("Java");
		
		ArrayList<String> ar8 = new ArrayList<String>();
		ar8.add("Selenium");
		ar8.add(".net");
		
		ar7.retainAll(ar8);
		
		for(int j=0;j<ar7.size();j++)
		{
			System.out.println(ar7.get(j));
		}
		
	}

}
