package starpaterns9;

public class P171 {
	
	public static void main(String[] args) {
		
		int n=4;
		int num=0;
		int x=3;
		
		for(int i=1;i<=n*2-1;i++)
		{
			x=3;
			num=i;
			if(i>=n) 
				num=n*2-i;
			
			
			for(int j=1;j<=num;j++)
			{
				System.out.print(x);
				x--;
			}
			
			System.out.println();
		}
		
		
		
	}

}
