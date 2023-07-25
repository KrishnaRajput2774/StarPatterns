package starpaterns8;

public class P148 {
	
	public static void main(String[] args) {
		

		
		
		int n=5;
		int z=1;
		int x=1;
		
		
		for(int i=0;i<n;i++)
		{
			x=i;
			for(int k=0;k<(n-i-1);k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=z;j++)
			{
				System.out.print(Math.abs(x--));
			}
			z+=2;
			System.out.println();
		}
		
		
	
		
		
		
	}

}
