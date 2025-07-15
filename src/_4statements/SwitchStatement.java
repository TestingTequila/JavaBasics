package _4statements;

public class SwitchStatement {

	public static void main(String[] args) {


		int marks =70;
		switch(marks)
		{
		case 90:
			System.out.println("The student has got A+");
			break;
		case 80:
			System.out.println("The student has got A");
			break;
		case 70:
			System.out.println("The student has got B+");
			break;
		case 60:
			System.out.println("The student has got B");
			break;
			default:
			System.out.println("The student has scored C");
		}
		
	}

}
