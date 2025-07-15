package _4statements;

public class MultipleIfStatement {

	public static void main(String[] args) {

		int marks = 88;
		if(marks>90)
		{
			System.out.println("The student has got A+");
		}
		if(marks>80  && marks<90)
		{
			System.out.println("The student has got A");
		}
		if(marks>70  && marks<80)
		{
			System.out.println("The student has got B+");
		}
		if(marks>60  && marks<70)
		{
			System.out.println("The student has got B");
		}
		else
		{
			System.out.println("The student has got C");
		}
	}

}
