

package HomeworkPractise;

import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		// Get numbers from users and do calculations
		
	Scanner a = new Scanner(System.in);
	System.out.println("Enter the first number :" );
	int x=a.nextInt();
	System.out.println("Enter the second number :");
	int y=a.nextInt();
	int m=x+y;
	int p=x-y;
	int q=x*y;
	int r=x/y;
	int z=x%y;
	System.out.println("Ans for adding x&y:"+m);
	System.out.println("Ans for suntracting x&y:"+p);
	System.out.println("Ans for multiplying x&y:"+q);
	System.out.println("Ans for dividing x&y:"+r);
	System.out.println("Ans for divicing x&y:"+z);
	
	
	
	a.close();
	}

}








