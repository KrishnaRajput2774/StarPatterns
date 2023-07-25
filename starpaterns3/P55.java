
package starpaterns3;

public class P55 {
	public static void main(String[] args) {
		
		
		int x=1,n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(x*x+"   ");
				x++;
			}
			System.out.println();
		}
		
		
		
	}

}
/*
1   
4   9   
16   25   36   
49   64   81   100   
121   144   169   196   225  
 */