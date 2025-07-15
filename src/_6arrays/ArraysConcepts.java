package _6arrays;

public class ArraysConcepts {

	public static void main(String[] args) {

		//1,2,3,4,5
		int x =1;
//		int y =2;
//		int z =3;
//		int a =4;
//		int b =5;
		
		
		//dataType[] nameOfArray = {value1, value2, value3 , valueN};
		
		int[] numbers ={1,2,3,4,5};
		System.out.println(numbers[2]);//3
		System.out.println(numbers[4]);//5
		
		
		//65, 76, 22, 34, 99
		int[] marks = {65, 76, 22, 34, 99};
		System.out.println(marks[0]);//65
		System.out.println(marks[1]);//76
		System.out.println(marks[3]);//34
		
		
		//Jason, Bran, Roger, Ashish, Kerry, Rose
		String name = "Jason";
		
		String[] names = {"Jason", "Bran", "Roger", "Ashish", "Kerry", "Rose"};
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		System.out.println(names[5]);
		
		
		//Apple, Mango, pineapple, grapes, oranges, papaya 
		String[] fruits = {"Apple", "Mango", "pineapple", "grapes", "oranges", "papaya" };
		System.out.println(fruits[0]);
		System.out.println(fruits[1]);
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
		System.out.println(fruits[4]);
		System.out.println(fruits[5]);
		
	}

}
