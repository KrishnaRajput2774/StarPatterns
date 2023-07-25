package starpaterns4;

public class P76 {
	
	public static void main(String[] args) {
		
		int x;
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			x=i;
			
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+++" ");
			}
			System.out.println();
		}
		
		
	}

}
/*
5 6 7 8 9
4 5 6 7 
3 4 5 
2 1
1
*/
