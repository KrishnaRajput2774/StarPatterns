package starpaterns6;

public class P102 {
	public static void main(String[] args) {
		
		int n=5;
		int x=1;
		
		
		for(int i=5;i>=1;i--) 
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
				{
					System.out.print(x);
					x+=2;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
	}

}
