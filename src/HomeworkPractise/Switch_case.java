package HomeworkPractise;
import java.util.Scanner;


public class Switch_case {

	public static void main(String[] args) {
		
Scanner w = new Scanner(System.in);

System.out.println("enter any number to find the day ");
int y = w.nextInt();

switch (y)
{
case 1:
	System.out.println("The day is Monday");
	break;
	
case 2:
	System.out.println("The day is Tuesday");
	break;
	
case 3:
	System.out.println("The day is wednesday");
	break;
	
case 4:
	System.out.println("The day is Thursday");
	break;
	
case 5:
	System.out.println("The day is Friday");
	break;
	
case 6:
	System.out.println("The day is Saturday");
	break;
	
case 7:
	System.out.println("The day is Sunday");
	break;
	default:
		System.out.println("The day is invalid");
}
	}

}
