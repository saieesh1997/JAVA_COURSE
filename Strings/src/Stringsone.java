
public class Stringsone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Java";
		System.out.println(s);
		
		
		String s1 = "hello";
		String s5 = "HELLO";
		
		
		
		if(s1.equals(s5)) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		
		if(s1 == s5) {
			System.out.println("Match");
		}else {
			System.out.println("Not Match");
		}
		
		if(s1.equalsIgnoreCase(s5)) {
			System.out.println("Match");
		}
		
		
		String a = "ABC";
		String b = "BCA";
		
		System.out.println(a.compareTo(b));
		
		String c = "BCA";
		String d = "ABC";
		
		System.out.println(c.compareTo(d));
		
		
		
		

	}

}
