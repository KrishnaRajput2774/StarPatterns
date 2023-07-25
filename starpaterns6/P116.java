package starpaterns6;

public class P116 {
	
	public static void main(String[] args) {
		
		
		
		char n='E';
		
		for(char i=n;i>='A';i--)
		{
			for(char k='A';k<i;k++)
			{
				System.out.print(" ");
			}
			for(char j=n;j>=i;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
	}

}
