package starpaterns9;

public class P176 {
	
	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=n-1;i>=-(n-1);i--)
		{
			for(int j=n-1;j>=Math.abs(i);j--)
			{
				System.out.print((char)(65+j));
			}
			System.out.println();
		}
		
		
	}

}
