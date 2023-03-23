import java.util.Scanner;

class Demo {
	void printEveneArrayIndex(int[] arr) {
		System.out.println("Even Index");
		for (int i = 0 ; i < arr.length ; i++ ) {
			if(i%2==0) {
				System.out.println(arr[i]);
			}
		}
	}
	
void printOddArrayIndex(int[] arr) {
		System.out.println("ODD INDEX");
		for (int i = 0 ; i < arr.length ; i++ ) {
			if(i%2!=0) {
				System.out.println(arr[i]);
			}
		}
	}


void sumOfArrayElements(int[] arr) {
	System.out.println("SUM of the array");
	int sum = 0;
	for (int i = 0 ; i < arr.length ; i++ ) {
		sum = sum + arr[i];
		
	}
	System.out.println("Sum of the Array is"+sum);
}
}

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d  = new Demo();
		int [] arr = new int[5];
		Scanner Scan = new Scanner(System.in);
		for(int i =0 ;i < arr.length ;i++) {
			arr[i] = Scan.nextInt();
		}
		
		d.printEveneArrayIndex(arr);
		d.printOddArrayIndex(arr);
		d.sumOfArrayElements(arr);
		

	}

}
