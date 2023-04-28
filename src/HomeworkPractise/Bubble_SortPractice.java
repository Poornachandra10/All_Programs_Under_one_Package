package HomeworkPractise;

public class Bubble_SortPractice {

	/*static void bubbleSort(int[] arr) {
	int n = arr.length;
	int temp = 0 ;

	for (int i =0; i< n; i++) {
	for (int j=1; j<(n-1); j++)	{
		if (arr[j-1]>arr[j]) {
			temp=arr[j-1];
			arr[j-1]=arr[j];
			arr[j]=temp;
		}
	}
	}
	}	
	public static void main(String[] args) {
		
int arr[] = {69,25,40,50,22};
System.out.print("Print before sorting  ");
{
	for(int i = 0; i<arr.length; i++)
	{
		System.out.print(arr[i] +" ");
	}
	
	System.out.println();
	bubbleSort(arr);
	System.out.print("Print after sorting  " );
	
	for(int i=0; i<arr.length; i++)
	{
		System.out.print(arr[i]+" ");
	}
	}
			
*/	static void bubbleSort(int[] arr)
	{
		
	int n = arr.length;
	int temp =0;
	for (int i=0; i<n; i++)
	{
		for(int j=1; j<n-1; j++)
		{
			if(arr[j-1]>arr[j]) {
				temp=arr[j-1];
				arr[j-1]=arr[j];
				arr[j]=temp;
				
					
					
		}
		}
	}
	}
	public static void main(String[] args)
	{
		int arr[]= {10,21,31,1,45};
		System.out.print("print before sort ");
		{
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+" ");
			}
			}
			System.out.println();
		bubbleSort(arr);
		System.out.print("print after sort ");
		for (int i =0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	
}
	}

