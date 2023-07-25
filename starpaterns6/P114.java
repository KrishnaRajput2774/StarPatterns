package starpaterns6;

public class P114 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		
//		for(int i=0;i<n;i++)
//		{
//			for(int k=1;k<=n-i;k++)
//			{
//				System.out.print(" ");
//			}
//			for(int j=i;j>=0;j--)
//			{
//				System.out.print((char)(65+j));
//			}
//			System.out.println();
//		}
		

		int x;
		for(int i=1;i<=n;i++)
		{
			x=i;
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+x));
				x--;
			}
			System.out.println();
		}
		
		
		
	}

}
