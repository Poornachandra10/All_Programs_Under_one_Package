package HomeworkPractise;
import java.util.Scanner;

public class Loop_3 {

	public static void main(String[] args) {
//1234,123,12,1.....& printing stars
		
		Scanner t = new Scanner(System.in);
		
		System.out.print("Enter Any Number");
		int z=t.nextInt();
		
		for(int i=1; i<=z; i++)
		{
			for( int j=1; j<=i; j++)
			
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
		


		
		
		for(int i = z-1; i>=1; i--)
		{
			for(int j=i; j>=1; j--)
			{
				System.out.print(" * ");
			
		}
		System.out.println();
t.close();
	}
		
		
	}

}