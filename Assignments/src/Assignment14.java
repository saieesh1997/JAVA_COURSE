import java.util.Scanner;

public class Assignment14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a program to convert celsius to fahrenheit
//		Formula : fahrenheit= ((celsius*9)/5)+32
        
		Scanner scan = new Scanner(System.in);
		float celsius = scan.nextFloat();
		
		float fahrenheit = ((celsius*9)/5)+32;
		System.out.println(fahrenheit);
		
		
		//Write a program to convert celsius to fahrenheit
		//Formula : Celsius = ((Fahrenheit-32)*5)/9;
		
		float  far = scan.nextFloat();
		
		float Celsius = ((far-32)*5)/9;
		
		System.out.println(Celsius);

	}

}
