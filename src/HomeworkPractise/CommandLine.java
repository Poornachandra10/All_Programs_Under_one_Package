package HomeworkPractise;

public class CommandLine {

	public static void main(String[] args) {
		// run in commandprompt
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		char c = args[2].charAt(0);
		
		
		if (c=='a')
		System.out.print(a*b);
		else
			if(c=='n')
				System.out.print(a-b);
		
			else
				if(c=='m')
					System.out.print(a*b);
	}

}
