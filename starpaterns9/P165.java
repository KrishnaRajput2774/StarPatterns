package starpaterns9;

public class P165 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int k=n;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(i*2-1);
			}
			System.out.println();
		}
		
		
	}



}
