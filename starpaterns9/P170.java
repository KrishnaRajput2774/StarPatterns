package starpaterns9;

public class P170 {
	
	public static void main(String[] args) {
		int n=9;
		int j=1;
		
		for(int i=1;i<=n;i++)
		{
			if(i<=n/2+1)
			{
				for(j=1;j<=i;j++)
				{	
				System.out.print("*");
				}
			}
			else
			{
				for(int k=j-2;k>=1;k--)
				{
					System.out.print("*");
				}
				j--;
				
			}
			System.out.println();
			
				
		}
		
		
		
	}

}
