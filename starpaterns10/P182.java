package starpaterns10;

public class P182 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		int x=1;
		
		for(int i=(n-1);i>=-(n-1);i--)
		{
			for(int j=Math.abs(i);j>0;j--)
			{
				System.out.print(" ");
			}
			x=Math.abs(i);
			for(int k=n-Math.abs(i)-1;k>=0;k--)
			{
				System.out.print(x++);
			}
			System.out.println();
		}
		
		
		
	}

}
