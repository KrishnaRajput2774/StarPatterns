package starpaterns8;

public class P157 {
	public static void main(String[] args) {
		
		
		int n=5;
		int x=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print((char)(64+x));
				
			}
			x+=2;
			System.out.println();
		}
		
		
		
	}

}
