package starpaterns3;

public class P54 {
	public static void main(String[] args) {
		
		
		int x=1,p=1,n=5;
		
		for(int i=1;i<=n;i++)
		{
			x=p;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+"  ");
				p=x;
				x++;
			}
			System.out.println();
			
			
			
		}
		
		
		
		
	}

}
/*
1  
1  2  
2  3  4  
4  5  6  7  
7  8  9  10  11  
*/
