
public class Printing {

	public static void main(String[] args) {
		//printing 12345 in five rows five columns
		
	//	int i,j;
		
		/*for(i=0; i<=5; i++)
		{
			for(j=0; j<=5; j++)
			{
				System.out.print(i+" ");
			}
			System.out.println();*/
	
		
		//print 1,12,123,1234,12345	
		/*for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}*/
		
		/*print stars
				for(i=1; i<=5; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
				}
				
			for(int x=4; x>0; x--) {
				for(int y=1; y<=x; y++) {
					System.out.print("*");
				}
				System.out.println();
			}*/
		
	/*	for(i=1; i<=5; i++) {
			for(j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			for(int z = 1; z<=i; z++) {
				System.out.print("* ");
		}
			System.out.println();
			}
		
		
	for(int l=1; l<=4; l++) {
		for(int q=1; q<=l; q++)
		{
			System.out.print(" ");
		}
		for(int m=0; m<=4-l; m++) {
			System.out.print("* ");
		}
		System.out.println();*/
		
		
		for(int a =1; a<=5; a++) {
			for(int b =1; b<=5-a; b++) {
				System.out.print(" ");
			}
			for(int c= 1; c<=a; c++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int d= 1; d<=4;d++) {
			for(int e=1; e<=d; e++) {
				System.out.print(" ");
			}
			for(int f =0; f<=4-d; f++)
			{
				System.out.print("* ");
			}
		
		System.out.println();
		}
			
}
}