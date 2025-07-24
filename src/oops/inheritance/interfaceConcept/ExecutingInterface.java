package oops.inheritance.interfaceConcept;

public class ExecutingInterface {

	public static void main(String[] args) {

		System.out.println("======CLASS A OBJECT======================");
		A a1 = new A();
		a1.addition(12, 4);
		a1.subtraction(12, 4);
		a1.multiplication(12, 4);
		a1.division(12, 4);
		
		System.out.println("======CLASS B OBJECT======================");
		B b1 = new B();
		b1.addition(12, 4);
		b1.subtraction(12, 4);
		b1.multiplication(12, 4);
		b1.division(12, 4);
		
		System.out.println("======CLASS A OBJECT======================");
		C c1 = new C();
		c1.addition(12, 4);
		c1.subtraction(12, 4);
		c1.multiplication(12, 4);
		c1.division(12, 4);
		
		System.out.println("======CLASS A OBJECT======================");
		D d1 = new D();
		d1.addition(12, 4);
		d1.subtraction(12, 4);
		d1.multiplication(12, 4);
		d1.division(12, 4);
		
		System.out.println("======INTERFACE BASE OBJECT NOT ALLOWED======================");
		//Base bs =new Base(); We cannot create object of an Interface

	}

}
