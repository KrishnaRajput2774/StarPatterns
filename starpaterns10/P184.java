package starpaterns10;

public class P184 {
	
	public static void main(String[] args) {
		
		int n=4;
		int ch;
		
		for(int i=(n-1);i>=-(n-1);i--)
		{
			ch=Math.abs(i);
			for(int s=Math.abs(i);s>=1;s--)
			{
				System.out.print(" ");
			}
			
			for(int j=n-Math.abs(i);j>=1;j--)
			{
				System.out.print((char)(65+ch++));
			}
			System.out.println();
			
		}
		
		
		
	}

}
