package _8methods;

public class ExecutingResume {

	public static void main(String[] args) {

		Resume r1= new Resume();
		r1.firstName = "Jason";
		r1.lastName = "Hill";
		r1.gender='m';
		r1.isFromIT = false;
		r1.totalExperiance = 5;
		r1.printResume();
		
		System.out.println("=============================");
		
		Resume r2= new Resume();
		r2.firstName = "John";
		r2.lastName = "Wright";
		r2.gender='f';
		r2.isFromIT = true;
		r2.totalExperiance = 9;
		r2.printResume();
		
	}

}
