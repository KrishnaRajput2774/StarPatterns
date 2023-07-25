package starpaterns5;

public class P90 {
	public static void main(String[] args) {
		
		for(char ch='A';ch<='E';ch++)
		{
			for(char c='E';c>=ch;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
	}

}
//E D C B A 
//E D C B 
//E D C 
//E D 
//E 
