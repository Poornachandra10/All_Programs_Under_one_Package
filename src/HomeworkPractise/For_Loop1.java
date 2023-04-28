package HomeworkPractise;
import java.util.Scanner;

public class For_Loop1 {

	public static void main(String[] args) {
		//get value from user and print stars for the value
		Scanner u =new Scanner(System.in);
		
		System.out.print("enter any num:");
		int a =u.nextInt();
		
		for(int i=1; i<=a; i++)
		{
			System.out.println("\n*");
		}
	}

}
