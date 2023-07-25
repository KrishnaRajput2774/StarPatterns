package starpaterns1;

public class Pattern17 {
	public static void main(String[] args) {
		
		
		int c=1;
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.printf("%3d",c);
				c+=2;
			}
			System.out.println();
			c=i+2;
		}
			
	}

}