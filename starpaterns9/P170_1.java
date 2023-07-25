package starpaterns9;

public class P170_1 {
	
	public static void main(String[] args) {
		
		int n=5;
		int x=0;
		
		
		for(int i=1;i<=n*2-1;i++)
		{
			if(i>n)
				x--;
			else
				x++;
			
			for(int j=1;j<=x;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		
	}

}
