package oops;

public class InheritanceConcept 
{

	public static void main(String[] args) 
	{
		A a1 = new A();
		a1.addition(12, 8);
		
		B b1 = new B();
		b1.addition(12, 10);
		b1.subtraction(12, 7);
		
		C c1 = new C();
		c1.addition(12, 8);
		c1.subtraction(12, 6);
		c1.multiplication(12, 4);
		
		
		 D d1= new D();
		 d1.addition(12, 8);
		 d1.subtraction(12, 8);
		 d1.multiplication(12, 8);
		 d1.division(12, 8);
		
		
	}

}
