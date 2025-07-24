package oops.polymorphism.overriding;

public class ExecutingOverriding {

	public static void main(String[] args) {

		P p1 = new P();
		p1.addition(12, 4);
		p1.subtraction(12, 4);
		
		C c1 = new C();
		c1.addition(12, 4);
		c1.subtraction(12, 4);
	}

}
