package _4statements;

public class IfElseIfStatement {

	public static void main(String[] args) {

		int marks = 68;
		if(marks>90)
		{
			System.out.println("The student has got A+");
		}
		else if(marks>80  && marks<90)
		{
			System.out.println("The student has got A");
		}
		else if(marks>70  && marks<80)
		{
			System.out.println("The student has got B+");
		}
		else if(marks>60  && marks<70)
		{
			System.out.println("The student has got B");
		}
		else
		{
			System.out.println("The student has got C");
		}
	}

}
