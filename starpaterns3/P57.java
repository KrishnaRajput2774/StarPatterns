package starpaterns3;

public class P57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=1,x=0,y=1,n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(a+"   ");
				a=x+y;
				x=y;
				y=a;
			}
			System.out.println();
		}

	}

}
/*
 * Fibonacci Series
1   
1   2   
3   5   8   
13   21   34   55   
89   144   233   377   610 
 */
