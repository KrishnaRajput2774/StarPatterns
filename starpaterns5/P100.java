package starpaterns5;

public class P100 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("_");
			}
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print(n-(i+k)+2);
			}
			System.out.println();
		}	
	}
}
