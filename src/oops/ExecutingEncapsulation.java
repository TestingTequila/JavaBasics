package oops;

public class ExecutingEncapsulation {

	public static void main(String[] args) {

		EncapsulationConcept ec = new EncapsulationConcept();
		ec.setEmpName("Ben");
		ec.setEmpSalary(15000);
		
		System.out.println("Pay " + ec.getEmpName() + " a salary of $" + ec.getEmpSalary());
		
	}

}
