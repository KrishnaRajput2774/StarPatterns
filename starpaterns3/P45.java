package starpaterns3;

public class P45 {

	public static void main(String[] args) {
		
		int x=1,n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x+=2;
			}
			System.out.println();
		}
		
	}

}
/*
1 
3 5 
7 9 11 
13 15 17 19 
21 23 25 27 29 
*/