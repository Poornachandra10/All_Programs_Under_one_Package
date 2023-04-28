package HomeworkPractise;
import java.util.Scanner;

public class Loop_4 {

	public static void main(String[] args) {
	
		Scanner l = new Scanner(System.in);
		System.out.println("enter one no");
		int h = l.nextInt();
		
		for(int a =1; a<=h; a++)
		{
			for (int sp = 1; sp<=h-a; sp++)
			{
				System.out.print(" ");
			}
			
		for (int b = 1; b<=a; b++)
		{
			System.out.print("* ");
			
		}
		System.out.println();
		}
		
		for(int a =1; a<=h; a++)
		{
			for(int sp =1; sp<=a; sp++)
			{
				System.out.print(" ");
			}
			for (int b =0; b<h-a; b++)
			{
				System.out.print("* ");
				
			}
			
		System.out.println();
		
		}
	}
	}
