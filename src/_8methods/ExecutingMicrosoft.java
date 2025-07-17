package _8methods;

public class ExecutingMicrosoft {

	public static void main(String[] args) {

		Microsoft ms = new Microsoft();
		ms.printFullName1("Ashish", "Mishra"); //void 
		String myFirstName =ms.printFullName2("Kerrie", "Wright"); //String
		System.out.println(myFirstName + " Microsoft");
	}

}
