package starpaterns7;

public class P121 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<n-i+1;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(n-i+k);
			}
			System.out.println();

		}
		
	}

}