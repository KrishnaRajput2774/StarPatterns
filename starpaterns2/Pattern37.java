package starpaterns2;

public class Pattern37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int x=n;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
			}
			x--;
			System.out.println();
		}
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		

	}

}
/*
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 
5 
4 4 
3 3 3 
2 2 2 2 
1 1 1 1 1 
*/
