package starpaterns8;

public class P147 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		int z=1;
		int x=1;
		
		
		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<i*2;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=z;j++)
			{
				System.out.printf("%3d",x++);
			}
			z+=2;
			System.out.println();
		}
		
		
	
		
		
		
	}

}
