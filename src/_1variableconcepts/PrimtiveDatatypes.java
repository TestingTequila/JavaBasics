package _1variableconcepts;

public class PrimtiveDatatypes {
	
	public static void main(String[] args) {
		//[I(byte, short, int, long), D(float, double), Single Character(char), (true/false)boolean]
		
		byte x1 =10;
		short x2 =10;
		int x3=10;
		long x4=10;
		
		byte b1 =-128;
		byte b2= 127;
		//byte b3= 128; //Cannot store 128 as byte as this is beyond its range
		
		
		
		short s =100;
		short s1 =128;
		short s2=-3276;
		short s3=32767;
		
		int s4 =32768;
		int i1 = -2147483648;
		int i2 = 2147483647;
		
		long l1 =2147483648L;
		
		
		
		
		int i= 100;
		long l= 100L;
		
		float f1= 10.34F;
		double d1 =10.34;
		
		char c ='a';
		
		boolean z =true;
		
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		//1. byte = 1 byte(8 bits) [-128 to 127]
		//2. short = 2 bytes(16 bits)[-32768 to 32767]
		//3. int   = 4 bytes(32 bits)[-2147483648 to 2147483647]
		//4. long  = 8 bytes(64 bits)[-9223372036854775808 to 9223372036854775807]
		
		
		short b3= 224;
		
	
	}

}
