
public class LinSearch {
public static void linSearch(int[] a1, int key) {
	for(int i=0; i<a1.length; i++) {
		
		if(a1[i]==key) 
		{
			
System.out.println("The key is found at " +i);


		}
		
	}
		
	
	}

	public static void main(String[] args) {
		// TODO Search an element
		int[] a= {10,20,30,49,45,30,67,10};
		int key=10;
		linSearch(a, key);
	}

}
