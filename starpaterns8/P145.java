package starpaterns8;

public class P145 {
	public static void main(String[] args) {
		
		int n=5;
		int z=1,x;
		
		for(int i=n;i>=1;i--)
		{
			x=i;
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=z;j++)
			{
				System.out.print(x);
				x++;
			}
			z+=2;
			System.out.println();
		}
		
		
		
	}

}
