package _6arrays;

public class HandlingArrays {

	public static void main(String[] args) {

		int[] numbers ={11, 32, 66, 88, 91, 21};
		
		System.out.println("=====================while loop====================");
		int a =0;
		while(a<numbers.length)
		{
			System.out.println(numbers[a]);//11, 32,66, 88, 91, 21
			a++;
		}
		
		System.out.println("=====================for loop====================");
		
		for(int b =0;b<numbers.length;b++)
		{
			System.out.println(numbers[b]);//11, 32,66, 88, 91, 21
			
		}
		
		System.out.println("=====================advanced for loop====================");
	    for(int num: numbers)
	    {
	    	System.out.println(num);
	    }
	    
	    System.out.println("===================MARKS ARRAY=============================");
	    
	    System.out.println("=====================while loop====================");
	    
	    int[] marks = {65, 76, 22, 34, 99};
	    
		int c =0;
		while(c<marks.length)
		{
			System.out.println(marks[c]);
			c++;
		}
		
       System.out.println("=====================for loop====================");
		for(int d =0;d<marks.length;d++)
		{
			System.out.println(marks[d]);
			
		}
		
		System.out.println("=====================advanced for loop====================");
		for(int i : marks)
		{
			System.out.println(i);
		}
		
		String[] names = {"Jason", "Bran", "Roger", "Ashish", "Kerry", "Rose"};
		
		System.out.println("=====================while loop====================");
		int x =0;
		while(x<names.length)
		{
			if(names[x]!="Roger")
			{
			System.out.println(names[x]);
			}
			x++;
		}
		
		
		System.out.println("=====================for loop====================");
		
		for(int y =0;y<names.length;y++)
		{
			System.out.println(names[y]);
			
		}
		
		System.out.println("=====================advanced for loop====================");
		for(String n: names)
		{
			System.out.println(n);
		}
			
	}

}
