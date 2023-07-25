package starpaterns6;

public class P115 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=n;i>0;i--)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print((char)(64+j));
			}
			System.out.println();
		}
		
		
		
	}

}
