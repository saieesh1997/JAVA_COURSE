import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class CollectionArraylist3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()) {
			list.add(scan.nextInt());
		}
		
		ListIterator<Integer> itr =  list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
        
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}

}
