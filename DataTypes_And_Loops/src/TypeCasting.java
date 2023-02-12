public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Implicit Type Casting :- Coverstion of small datatype to large datatype");
		System.out.println("For Example- Byte To Double");
		byte a = 45;
		double b;
		b = a;
		System.out.println(a);
		System.out.println(b);
		
		
		
		System.out.println("Explicit Type Casting :- Coverstion of large datatype to small datatype");
		System.out.println("For Example- Double To Byte");
		byte c;
		double d =45.5;
		//a=b; // This shows error since java cnnot convert automatically.
		c= (byte)b;
		System.out.println(d);
		System.out.println(c);
	
		
	}

}
