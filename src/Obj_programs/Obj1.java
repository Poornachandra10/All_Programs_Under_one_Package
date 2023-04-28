package Obj_programs;
import java.util.Scanner;

public class Obj1 {
int a,b,c,d, m,u;

public void Add()

{
	 m = (a+b+c+d);
}
public void Sub()
{
	 u = (a-b-c-d);
}

	public static void main(String[] args) {
		Obj1 z = new Obj1();
		Scanner t = new Scanner(System.in);
		System.out.println("Print value a");
		 z.a = t.nextInt();
		System.out.println("Print value b");
		z.b = t.nextInt();
		System.out.println("Print value c");
		z.c = t.nextInt();
		System.out.println("Print value d");
		z.d = t.nextInt();
		
		
		z.Add();
		z.Sub();
		
		System.out.println("The value of adding the number s "+ z.m);
		System.out.println("The value of  subtracting the number s "+ z.u);
				
				
				
}
		

	}


