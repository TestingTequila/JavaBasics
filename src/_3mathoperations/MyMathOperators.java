package _3mathoperations;

public class MyMathOperators {

	public static void main(String[] args) {

		System.out.println("======[I/I=I]=========");

		//1. I/I = I [when we divide integer by anathor integer, this will always pick the integer part]
		System.out.println(10/2);//5
		System.out.println(9/2);//4
		
		System.out.println("======[I/D=D or D/I=D]=========");
		
		//2. I/D or D/I = D [If decimal is involved either in numerator or denominator, result will always be in decimal]
		System.out.println(10/2.0);//5.0
		System.out.println(10.0/2);//5.0
		System.out.println(9/2.0); //4.5
		System.out.println(9.0/2);//4.5
		
		int a =10;
		//int b =2;
		int c =3;
		System.out.println(a/c);//10/3
		double sum =a/c;//3
		System.out.println(sum);//3.0
		
		System.out.println("======MODULO OPERATOR(%)=========");
		
		//3. Modulo Operator
		System.out.println(10%2);//0
		System.out.println(9%2);//1
		System.out.println(9.0%2);//1.0
	}

}
