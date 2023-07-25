package starpaterns1;

public class Pattern16 {
	public static void main(String[] args) {
		
		int c,n=5;
		
		for(int i=1;i<=n;i++)
		{
			c=i;
			for(int j=1;j<=n;j++)
			{
				System.out.printf("%2d",c++);
			}
			System.out.println();
		}
		
		
		
		
	}

}


/* 
 1 2 3 4 5 
 2 3 4 5 6
 3 4 5 6 7
 4 5 6 7 8
 5 6 7 8 9
 */

