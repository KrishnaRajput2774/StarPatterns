package starpaterns8;

public class P146 {
	
	public static void main(String[] args) {
		
		int n=5;
		int z=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<n-i+1;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=z;j++)
			{
				System.out.print(n+i-j);
			}
			z+=2;
			System.out.println();
		}
		
		
		
	}

}
