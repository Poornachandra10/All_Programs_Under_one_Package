package HomeworkPractise;
import java.util.Scanner;

public class AreaPermeter {

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		// finding area , perimeter for rectangle
		
		//int x,x1,y1,z1,y,z=a.nextInt();
		System.out.println("enter  length value :\n");
		
		int x=a.nextInt();
		System.out.println("enter width value :\n");
		
		int y = a.nextInt();
		int p = (2*x)+(2*y);
		int q= x*y;
		System.out.println("Value of Rectangle perimeter :\n"+p);
		
		
	System.out.println("Value of Rectangle area :\n"+q);
	a.close();
	
	
	
	}
}
