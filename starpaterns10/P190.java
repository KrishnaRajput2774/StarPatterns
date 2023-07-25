package starpaterns10;

public class P190 {
	
	public static void main(String[] args) {
		
		
		int x=0;
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			x=i;
			
			for(int j=1;j<=n;j++)
			{
				if(x==n)
				System.out.print(n+" ");
				
				else
					System.out.print(x+++" ");
			}
			System.out.println();
		}
		
	}
}
