
package HomeworkPractise;

import java.util.Scanner;

public class Area_Circle {

	public static void main(String[] args) {
		Scanner a =new Scanner(System.in);
		
		
		System.out.println("Enter the radious of the circle");
		
		int r=a.nextInt();

		float pm=2*(22/7)*r;
		float area = (22/7)*r*r;
		
		System.out.println("Perimeter of the circle is\n"+pm);
		
		System.out.println("Area of the circle is \n"+area);
		
		

	}

}
