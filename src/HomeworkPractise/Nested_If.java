package HomeworkPractise;
import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {
		// get input from user and print the largest number
Scanner get = new Scanner(System.in);
int a,b,c;
System.out.println("Enter first number");
a=get.nextInt();
System.out.println("Enter second number");
b=get.nextInt();
System.out.println("Enter third number");
c=get.nextInt();



if (a>b)
{
	if(a<c) {
		System.out.println("The Largest number "+a);
	}
	else
		{
		System.out.println("The Largest number "+c);
		}
		}
if (b>a) {
	if(b>c)
	{System.out.println("The Largest number "+b);
}
			}
	
		
	
	else
	{
		System.out.println("The Largest number "+c);
	}
	
	}
	
	}
