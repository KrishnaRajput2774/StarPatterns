package starpaterns4;

public class P66 {
	
	public static void main(String[] args) {
		
		char n='E';
		
		for(char i='A';i<=n;i++)
		{
			for(char j='A';j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}

}
/*
A 
A B 
A B C 
A B C D 
A B C D E 
*/
