import java.util.StringTokenizer;

public class Mutablestrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer st = new StringBuffer();
		st.append("Java");
		System.out.println(st);
		
		st.append("Is My favorate Subje");
		System.out.println(st);
		
		System.out.println(st.capacity());
		
		st.append(8);
		System.out.println(st);
		String st1 = "hwloo nvnvlofv dkvn  kjnvnsvo";
		StringTokenizer sto = new StringTokenizer(st1);
		
		while(sto.hasMoreTokens()) {
			System.out.println(sto.nextToken());
		}
		
		//TO print the character from particular index
		String h ="Hello";
		
		System.out.println(h.charAt(1));
		
		System.out.println(h.toUpperCase());
		
		System.out.println(h.indexOf('e'));
		
		System.out.println(h.substring(0,2));
		
		
		
		
		
		
		
;	}

}
