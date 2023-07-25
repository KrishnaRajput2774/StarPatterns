package starpaterns9;

public class P172 {
	
	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=n-1;i>=-(n-1);i--)
		{
			for(int j=Math.abs(i);j<=n-1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
//3
//23
//123
//0123
//123
//23
//3

