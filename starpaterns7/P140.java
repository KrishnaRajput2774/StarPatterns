package starpaterns7;

public class P140 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<n-i+1;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=i*2-1;j>=1;j--)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
	}

}
//	  1
//   222
//  33333
// 4444444
//555555555

