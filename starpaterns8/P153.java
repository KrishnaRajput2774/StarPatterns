package starpaterns8;

public class P153 {
	
	public static void main(String[] args) {
		

		int n=5,x=1,z=1;
		
		for(int i=1;i<=n;i++)
		{
			x=i;
			for(int k=1;k<n-i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=z;j++)
			{
				System.out.print(x);
				
				if(i>j)
					x++;
				else
					x--;
			}
			z+=2;
			System.out.println();
		}	
	}
}