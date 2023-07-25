package starpaterns9;

public class P178 {
	
	public static void main(String[] args) {
		
		int n=4;
		int x;
		
		for(int i=n-1;i>=-(n-1);i--)
		{
			x=0;
			for(int j=n-1;j>=Math.abs(i);j--)
			{
				System.out.print((char)(65+x));
				x++;
			}
			System.out.println();
		}
		
		
	}
//	A
//	AB
//	ABC
//	ABCD
//	ABC
//	AB
//	A





}
