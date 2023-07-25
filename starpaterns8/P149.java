package starpaterns8;

public class P149 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		int z=1;
		int x=1;
		
		
		for(int i=1;i<=n;i++)
		{
			x=1;
			for(int k=1;k<n-i+1;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=z;j++)
			{
				System.out.print(x);
				if((i*2-2)/2<j)
				{
					x--;
				}
				else
					x++;
			}
			z+=2;
			System.out.println();
		}
		
		
	
		
		
	}

}
