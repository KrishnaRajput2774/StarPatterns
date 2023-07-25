package starpaterns3;

public class P48 {
	public static void main(String[] args) {
		
		int a=1;
		int n=5;
		int c,d;
		
		for(int i = n;i>=1;i--)
		{
			d=a;
			c=i;
			
			for(int j=n;j>=i;j--)
			{
				
				System.out.print(d+" ");
				d=d-c;
				c++;
			}
			System.out.println();
			a=a+i;
			
		}
		
		
	}

}
/*
1 
6 2 
10 7 3 
13 11 8 4 
15 14 12 9 5 
 */
