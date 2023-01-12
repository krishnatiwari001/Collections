package ListConcept;

public class Employee {
	String name;//global variable or class variable
	int age;//global variable or class variable
	String Dept;//global variable or class variable
	
	Employee(String name, int age, String Dept)//this is constructor and constructor name is always same as class name and all three are local variable
	{
		//if local variable and global variable both are same then we have to use this keyword
		this.name = name;//this.name is global variable and name is local variable
		this.age = age;//this.age is global variable and age is local variable
		this.Dept = Dept;//this.Dept is global variable and Dept is local variable
	}

}
