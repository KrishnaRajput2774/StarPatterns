package starpaterns3;

public class P47 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i*j+" ");
			}
			System.out.println();
		}
		
		
	}

}
/*
1 
2 4 
3 6 9 
4 8 12 16 
5 10 15 20 25 
 */
