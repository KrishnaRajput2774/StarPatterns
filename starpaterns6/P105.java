package starpaterns6;

public class P105 {	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) 
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=n-i+1;j--)
			{
					int a=n-j+i;
					System.out.print(a*a);		
			}
			System.out.println();
		}
		
		//n-j+i
		
	}

}
