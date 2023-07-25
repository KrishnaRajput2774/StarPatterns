package starpaterns6;

public class P106 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		int x=1;
		
		for(int i=5;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print(x++);
			}
			System.out.println();
		}
		
		
		
	}

}
//n-i+j  5-4+j
