package starpaterns3;

public class P42 {
	
	public static void main(String[] args) {
		
		int n=5, x=1;
		
		for(int r=1;r<=n;r++)
		{
			x=r;
			for(int c=1;c<=r;c++)
			{
				System.out.print(x+++" ");
			}
			System.out.println();
		}
		
		
		
	}

}
/*
1 
2 3 
3 4 5 
4 5 6 7 
5 6 7 8 9  
*/