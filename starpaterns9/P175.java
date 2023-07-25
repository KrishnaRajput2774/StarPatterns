package starpaterns9;

public class P175 {
	
	public static void main(String[] args) {
		
		
		int n=3;
		int x=1;
		int num=-1;
		
		for(int i=1;i<=n*2-1;i++)
		{
			x=i;
			if(i>n) {
				x=n*2-i;
				num-=2;
			}
			else
				num+=2;
			
			for(int j=1;j<=x;j++)
			{
				System.out.print(num);
			}
			
			System.out.println();
			
		}
		
		
	}

}
