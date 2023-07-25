package starpaterns10;

public class P183 {
	
	public static void main(String[] args) {
		
		int n=4;
		int num=1;
		
		for(int i=1;i<=n*2-1;i++)
		{
			for(int s=Math.abs(n-i);s>=1;s--)
			{
				System.out.print(" ");
			}
			num=i;
			if(i>n)
				num=n*2-i;
			
			for(int j=1;j<=num;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		
	}

}
