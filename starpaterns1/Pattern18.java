package starpaterns1;

public class Pattern18 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		int c;
		
		for(int i=0;i<n;i++)
		{
			c=i%2;
			for(int j=0;j<n;j++)
			{
				if(j%2==0)
				{
					System.out.printf("%3d",c);
				}
				else
				{
					System.out.printf("%3d",c);
				}
			}
			System.out.println();
		}
		
		
	}

}
