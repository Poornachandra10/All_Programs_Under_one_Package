package HomeworkPractise;
import java.util.Scanner;

public class If_Else_If {

	public static void main(String[] args) {
		// get 3 numbers from users and print the largest num:
		
		
Scanner num = new Scanner(System.in);
 System.out.println("Type first Number: ");
 int a = num.nextInt();
 System.out.println("Type second Number: ");
 int b = num.nextInt();
 System.out.println("Type third Number: ");
 int c = num.nextInt();
 
 
	if ((a>b)&&(a>c)) 
	{
		System.out.println("largest number is "+a);
	
	}
	else if ((b>a)&&(b>c))
	{
		
	System.out.println(" Largest number is  "+b);
	
	}
//	int c;
		
	else 
	{
	
	
	System.out.println("Largest number is "+ c);
	}
	

	
	
	}

}
