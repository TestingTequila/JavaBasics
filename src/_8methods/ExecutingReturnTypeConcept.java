package _8methods;

public class ExecutingReturnTypeConcept {

	public static void main(String[] args) {

		ReturnTypeConcept r1 = new ReturnTypeConcept();
		r1.addition1(2, 4);//void
		
		int c =r1.addition2(2, 4);//2
		System.out.println(c);
		
		
		int d =r1.addition3(2, 4);//4
		System.out.println(d);
		
		
		int e =r1.addition4(2, 4);//6
		System.out.println(e); //6
	}

}
