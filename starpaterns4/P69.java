package starpaterns4;

public class P69 {
	
	public static void main(String[] args) {
		
		
		int n='E';
		
		for(char i='A';i<='E';i++)
		{
			for(char j=i;j>='A';j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
A 
B A 
C B A 
D C B A 
E D C B A 
*/
