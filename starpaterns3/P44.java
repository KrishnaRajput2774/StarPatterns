package starpaterns3;

public class P44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4,x=0,y;
		
		for(int i=1;i<=n;i++)
		{
			y=x+=i;
			for(int j=1;j<=i;j++)
			{
				System.out.print(y+" ");
				y--;
			}
			System.out.println();
		}

	}

}
/*
1 
3 2 
6 5 4 
10 9 8 7 
 */
