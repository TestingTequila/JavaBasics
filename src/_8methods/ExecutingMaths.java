package _8methods;

public class ExecutingMaths {

	public static void main(String[] args) 
	{
        Maths m1=new Maths();
        m1.a =12;
        m1.b =8;
        
        m1.addition();//20
        m1.subtraction();//4
        System.out.println("=======================================================");
        
        Maths m2 = new Maths();
        m2.a =44;
        m2.b= 6;
        m2.addition();//50
        m2.subtraction();//38
        
        System.out.println("=======================================================");
        Maths m3 = new Maths();
        m3.a =78;
        m3.b = 67;
        m3.addition();//145
        m3.subtraction();//11
        
       
      
        
	}

}
