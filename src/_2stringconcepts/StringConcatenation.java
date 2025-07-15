package _2stringconcepts;

public class StringConcatenation {

	public static void main(String[] args) {

		String x= "hello";
		String y ="world";
		
		int a =100;
		int b =200;
		
		System.out.println(x);//hello
		System.out.println(y);//world
		
		System.out.println(a); //100
		System.out.println(b); //200
		
		System.out.println(a+b);//300 [adding]
		System.out.println(x+y);//helloworld
		System.out.println(y+x);//worldhello
		
		System.out.println(x+a);//hello100
		
		//String c ="hello100";
		
		System.out.println(a+b+x);//300hello
		System.out.println(a+b+x+y);//300helloworld
		
		System.out.println(x+y+a+b); //helloworld100200
		System.out.println(a+b+x+y+a+b);//300helloworld100200
		System.out.println(a+b+x+y+(a+b));// 300helloworld300 [BODMAS]
		
	}

}
