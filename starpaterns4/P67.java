package starpaterns4;

public class P67 {
	
	public static void main(String[] args) {
		
		char n='E';
		
		for(char i=n;i>='A';i--)
		{
			for(char j=n;j>=i;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}

}
/*
E 
E D 
E D C 
E D C B 
E D C B A 
*/
