package oops.polymorphism.overriding;

public class C extends P{
	
	@Override
	public void addition(int a, int b)
	{
		int sum = 2*a+2*b;
		System.out.println("Sum By C Class: " + sum);
	}

}
