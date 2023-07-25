package starpaterns9;

public class P162 {
	
	public static void main(String[] args) {
		
		int n=5;
		int x;
		
		for(int i=1;i<=n;i++)
		{
			x=i;
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print((char)(64+x));
				if(i>j)
					x++;
				else
					x--;
			}
			System.out.println();
		}
	}
}
