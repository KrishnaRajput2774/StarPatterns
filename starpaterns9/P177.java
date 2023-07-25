package starpaterns9;

public class P177 {
	
	public static void main(String[] args) {
		
		int n=4;
		int x;
		
		for(int i=n-1;i>=-(n-1);i--)
		{
			x=Math.abs(i);
			for(int j=n-1;j>=Math.abs(i);j--)
			{
				System.out.print((char)(65+x));
				x++;
			}
			System.out.println();
		}
		
		
	}



}
//D
//CD
//BCD
//ABCD
//BCD
//CD
//D
