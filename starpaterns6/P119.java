package starpaterns6;

public class P119 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
	}

}
//12345
//1234
// 123
//  12
//   1
