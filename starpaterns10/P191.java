package starpaterns10;

public class P191 {
	
	
	
	public static void main(String[] args) {
		
		
		
		int n=5;
		int x=5;
		
		for(int i=n;i>=1;i--)
		{
			x=i;
			for(int j=1;j<=n;j++)
			{
				if(x==n)
				{
					System.out.print(n+" ");
				}
				else
				{
					System.out.print(x+++" ");
				}
				
			}
			System.out.println();
		}
	}
}
