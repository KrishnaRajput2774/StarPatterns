package starpaterns2;

public class Pattern31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char i='A';
		for(char ch='A';ch<='E';ch++)
		{
			i=ch;
			for(char c='A';c<='E';c++)
			{
				System.out.print(i+++" ");
			}
			System.out.println();
		}

	}

}
/*
A B C D E 
B C D E F 
C D E F G 
D E F G H 
E F G H I 

 */
