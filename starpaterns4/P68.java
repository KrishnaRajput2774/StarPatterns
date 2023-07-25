package starpaterns4;

public class P68 {
	public static void main(String[] args) {
		
		
		char n='Z';
		
		for(char i=n;i>='A';i--)
		{
			for(char j=n;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
/*
E 
D D 
C C C 
B B B B 
A A A A A 
*/
