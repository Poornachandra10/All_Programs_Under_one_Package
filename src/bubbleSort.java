
public class bubbleSort {

	/*static void bubbleSort(int[] a) {
		int n=a.length;
		int temp =0;
		for(int i=0; i<n; i++) {
		for( int j=1;j<(n-1);j++) {
			if(a[j-1]>a[j])
			{temp=a[j-1];
				a[j-1]=a[j];
				a[j]=temp;
			}}}}
	public static void main(String[] args) {
		int a[]= {10,2,5,11,6};
		System.out.println("Before sorting");
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n\nAfter sorting");
bubbleSort(a);		
for (int i = 0; i<a.length; i++ )
{
	System.out.print(a[i]+" ");
}
*/
		public static void bubbleSort(int[] marks) {
		int temp = 0;
			int n =marks.length;
		for (int i = 0; i<n;  i++)
		{
			for(int j=1; j<(n-1); j++) {
				if (marks[j-1]>marks[j])
				{temp = marks[j-1];
				marks[j-1]=marks[j];
				marks[j]=temp;
				}
			}
			}
		}
		
		public static void main(String[] args) {
			int marks[]= {12,32,91,2,65};
			System.out.println("Before Sorting");
			for(int i =0; i<marks.length; i++) {
				System.out.print(marks[i]+" ");
			}
			
		bubbleSort(marks);	
		System.out.println("\nAfter Sorting");
		for(int i=0; i<marks.length; i++) {
			System.out.print(marks[i]+" ");
		}
		
			
		}
}

