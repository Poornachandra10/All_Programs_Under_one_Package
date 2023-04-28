package HomeworkPractise;
import java.util.Scanner;
public class Method {

	public static void main(String[] args) 
/*	{
	printMessage("hello");
	printMessage("good Morning");
	}
	public static void printMessage(String name) {
		System.out.println(name+ " akila");*/
	


	//{

		
		
		/*largest();
	}
public static void largest()
{
	int a = 10;
	int b= 95;
	if (a>b)
		System.out.print("The larger number is " +a);
		else
			System.out.println("THe larger number is  "+b);
		
*/
	/*{

		int a=10;
		int b = 500;
		int largerNum = large (a, b);
		System.out.print("Larger num is "+largerNum);
		}
		
public static int large(int a , int b) {
	int big;
	if (a>b)
		big=a;
	else
		big=b;
	return big;
	*/
	
	
	{
		Scanner k=new Scanner (System.in);
		int a,b,c;
		System.out.println("enter first value ");
	a=k.nextInt();
	System.out.println("enter second value ");
	b=k.nextInt();
	System.out.println("enter third value ");
	c=k.nextInt();
	
	int big=large(a, b, c);
	System.out.println("Big num is "+big);
	}
	
	public static int large(int a, int b, int c) {
		int lar;
		if ((a>b)&&
			(a>c))
			lar=a;
		else
			lar=c;
		if((b>a)&&(b>c))
			lar=b;
		else
			lar=c;
		return lar;
		
	}
}

	
	
	

	


