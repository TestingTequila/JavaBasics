package oops;

public class Polymorphism 
{
 
	public void addition(int a, int b)
	{
		int sum =a+b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
	
	public void addition(double a, int b)
	{
		double sum =a+b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
	
	public void addition(int a, double b)
	{
		double sum =a+b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
	
	public void addition(double a, double b)
	{
		double sum =a+b;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
	
	public void addition(double a, double b, int c)
	{
		double sum =a+b+c;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
	
	public void addition(int a, double b, int c)
	{
		double sum =a+b+c;
		System.out.println("The sum of " + a + " and " + b + " is " + sum);
	}
	
	//In a class we can have two or more methods with the same name, provided that the parameters are different
	   //by changing the data type of parameters
	   //by reordering the data types
	   //by changing the count of data types
}
