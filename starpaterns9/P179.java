package starpaterns9;

public class P179 {
	
	public static void main(String[] args) {
		
		int n=4;
		int x=-1;
		
		for(int i=n-1;i>=-(n-1);i--)
		{
			x++;
			for(int j=n-1;j>=Math.abs(i);j--)
			{
				System.out.print((char)(65+x));
				
			}
			System.out.println();
		}
		
		
	}
//	A
//	BB
//	CCC
//	DDDD
//	EEE
//	FF
//	G








}
