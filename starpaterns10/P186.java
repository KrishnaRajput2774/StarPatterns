package starpaterns10;

public class P186 {
	
	public static void main(String[] args) {
		
		int n=4;
		int x;
		
		for(int i=1;i<=n*2-1;i++)
		{
			for(int s = 1;s<=Math.abs(n-i);s++)
			{
				System.out.print(" ");
			}
			x=i;
			if(i>n)
				x=n*2-i;
			
			for(int j=1;j<=x;j++)
			{
				System.out.print((char)(64+i));
			}
			System.out.println();
		}
		
		
		
	}

}
