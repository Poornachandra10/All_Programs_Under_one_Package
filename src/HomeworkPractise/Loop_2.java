package HomeworkPractise;
import java.util.Scanner;

public class Loop_2 {

	public static void main(String[] args) {
		//1,12,123,1234.....
		
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("ENTER ANY NUMBER");
		int y = a.nextInt();
		
		for(int i=1; i<=y; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		

	}

}
