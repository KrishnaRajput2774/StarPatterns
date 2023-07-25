package starpaterns7;

public class P122 {
	
	public static void main(String[] args) {
		
		int n=5;
		
//		for(int i=n;i>=1;i--)
//		{
//			for(int j=n;j>=1;j--)
//			{
//				
//				if(i>=j)
//				{
//					System.out.print(j);
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//			
//			}
//			System.out.println();
//		}
		
		int x=0;
		
		for(int i=n;i>=1;i--)
		{
			x=i;
			for(int j=n;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(x);
				x--;
			}
			System.out.println();
		}
		
		
	}

}
