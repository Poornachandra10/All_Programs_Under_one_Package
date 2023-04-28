package ScannerPractice;
import java.util.Scanner;
public class FirstScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		int a,b;
		System.out.println("Enter first num");
		a=x.nextInt();
		System.out.println("Enter Second num");
		b=x.nextInt();
		
		int c = a+b;
		System.out.print("The ans is : "+c);
	}

}
