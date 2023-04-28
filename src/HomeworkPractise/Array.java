package HomeworkPractise;

public class Array {
	
	public static void main(String[] args) {



		
	/*	int x[]=new int[5];
for (int i=0; i<5; i++)
{
	x[i]=i;
}

for (int j=0; j<5; j++)
{
	System.out.println("x ["+ j +"]=" + x[j]);
}
		*/
		
		int x[][]={{11,22,33},{33,22,11}};
		int y[][]= {{44,55,66},{66,55,44}};
		int z[][]=new int [2][3];
		
		
		System.out.println("Value of x[][]\n");
		for (int i=0; i<2; i++) {
			for(int j=0; j<3;j++) {
				System.out.print(" "+x[i][j])	;
			}
		System.out.println();	
		
		}
		System.out.println("\nValue of y[][]\n");

		for (int i = 0; i<2; i++)
		{
			for (int j=0; j<3; j++)
			{
				System.out.print(" "+y[i][j]);
			}
		System.out.println();
		}
		
		System.out.println("\nValue of x[][]+y[][]\n");
		
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++)
			{
				z[i][j]=(x[i][j]+y[i][j]);
				
				
				System.out.print(" "+z[i][j]);
			}
			System.out.println();
		}
		}
		}
	

	
