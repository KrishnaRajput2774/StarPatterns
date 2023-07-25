package starpaterns4;

public class P75 {
	
	public static void main(String[] args) {
		
		int n=5;
		int y;
		
		for(int i=1;i<=n;i++)
		{
			y=i+4;
			for(int j=n;j>=i;j--)
			{
				System.out.print(y);
				y--;
			}
			System.out.println();
		}
		
	}

}
//54321
//6543
//765
//87
//9
