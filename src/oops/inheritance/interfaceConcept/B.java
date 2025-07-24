package oops.inheritance.interfaceConcept;

public class B implements Base{

	@Override
	public void addition(int a, int b) {
		int sum=2*a+b;
		System.out.println("Sum By A " + sum);
	}

	@Override
	public void subtraction(int a, int b) {
		int diff=2*a-b;
		System.out.println("Difference By A " + diff);
	}

	@Override
	public void multiplication(int a, int b) {
		int product=2*a*b;
		System.out.println("Multiplication By A " + product);
	}

	@Override
	public void division(int a, int b) {
		int divide=2*a/b;
		System.out.println("division By A " + divide);
	}

}
