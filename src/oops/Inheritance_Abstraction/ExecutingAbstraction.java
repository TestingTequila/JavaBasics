package oops.Inheritance_Abstraction;

public class ExecutingAbstraction {

	public static void main(String[] args) {

		System.out.println("========================CLASS A=======================");
		A a1 = new A();
		a1.addition(12, 8); //20
		a1.subtraction(12, 4); //8
		a1.multiplication(12, 4);//48
		a1.division(12, 4);//3
		
		System.out.println("========================CLASS B=======================");
		
		B b1= new B();
		b1.addition(12, 8);//40
		b1.subtraction(12, 4);//8
		b1.multiplication(12, 4);//48
		b1.division(12, 4);//3
		
		
		System.out.println("========================CLASS C=======================");
		
		C c1= new C();
		c1.addition(12, 8);//60
		c1.subtraction(12, 4);//8
		c1.multiplication(12, 4);//48
		c1.division(12, 4);//3
		
		
		System.out.println("========================CLASS D=======================");
		
		D d1= new D();
		d1.addition(12, 8);//80
		d1.subtraction(12, 4);//8
		d1.multiplication(12, 4);//48
		d1.division(12, 4);//3
		
		System.out.println("========================ABSTRACT CLASS OBJECT=======================");
		//Base bs= new Base();// We cannot create object of an Abstract class
		//bs.addition(12, 8);
		//bs.subtraction(12, 8);
		//bs.multiplication(2, 3);
		//bs.division(8, 4);
		
	}

}
