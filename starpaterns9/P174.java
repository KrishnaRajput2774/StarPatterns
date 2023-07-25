package starpaterns9;

public class P174 {
	
	public static void main(String[] args) {
		
		int n=4;
		int no=1;
		
		for(int i=n-1;i>=-(n-1);i--)
		{
			for(int j=n-1;j>=Math.abs(i);j--)
			{
				System.out.print(no);
				no++;
			}
			System.out.println();
		}
		
//		1
//		2  3
//		4  5  6
//		7  8  9  10
//		11 12 13
//		14 15
//		16
	
		
		
		
	}

}
