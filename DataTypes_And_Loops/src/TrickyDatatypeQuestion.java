
public class TrickyDatatypeQuestion {
	public static void main(String []args) {
		byte a = 127;
		System.out.println(a);
		a = (byte)(a+1);
		System.out.println(a);
		/*
		 Output:
		 127
		-128
		*/
	}

}
