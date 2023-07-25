package starpaterns8;

public class P141 {
	
	public static void main(String[] args) {
		
		
		
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<n-i+1;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=i*2-1;j>=1;j--)
			{
				System.out.print(i*2-1);
			}
			System.out.println();
		}
	}

}
