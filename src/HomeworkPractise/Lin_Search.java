package HomeworkPractise;
import java.util.Scanner;
public class Lin_Search {
	
	/*public static int linSearch(int[] arr, int key) {
for(int i =0; i<arr.length; i++) {
	if (arr[i]==key) {
		return i;
	}
}
		return -1;
}
	

		
	public static void main(String a[]) {
		int[] a1= {10,20,30,40,50,60,90};
		int key =80;
		System.out.print(key +"is on the array"+ linSearch(a1, key));*/
	
	
	
	
	
	
	
	public static int linSearch(int[] arr, int key)
	{
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]==key)
			{
				return i;
			}
			
			}
		return -1;
		}
	
	public static void main(String a[]) {
	Scanner c = new Scanner(System.in);
		int[] a1= {10,20,30,40,50,60,70};
		System.out.print("print any num in tens count");
		int key = c.nextInt();
		
		System.out.print(key+"is in the array "+linSearch(a1, key));
		
	}
		
	}

