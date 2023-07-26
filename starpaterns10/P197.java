package starpaterns10;

public class P197 {
	
	public static void main(String[] args) {
		
		int x=1;
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				
				if(x==9)
				{
					x=1;
				}
				System.out.print(x+++" a");	
			}
			System.out.println();
		}
	}

}
