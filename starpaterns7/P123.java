package starpaterns7;

public class P123 {
	
	public static void main(String[] args) {
		
		
		int n=5,x=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(x);
				x++;
			}
			x--;
			System.out.println();
		}
		
		
		
	}

}
