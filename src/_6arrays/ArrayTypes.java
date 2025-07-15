package _6arrays;

public class ArrayTypes {

	public static void main(String[] args) {

		//dataType[] variableName = {value1, value2, value3, valueN};
		//dataType[] variableName = new dataType[countOfvaluesToStore];
		
		int[] numbers = new int[4];
		numbers[0]=500;
		numbers[2]=99;
		int a =0;
		while(a<numbers.length)
		{
			System.out.println(numbers[a]);
			a++;
		}
	}

}
