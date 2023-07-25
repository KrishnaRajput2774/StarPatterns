package starpaterns8;

public class P151 {
	public static void main(String[] args) {
		

		int n=5;
		int x=1;
		
		for(int i=1;i<=n;i++)
		{
			x=i;
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++)
			{
				System.out.print(x);
				if(i>j)
					x--;
				else {
					x++;
				}
			}
			System.out.println();
		}
		
		
		
	
		
		
		
	}

}
