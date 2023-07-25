package starpaterns7;

public class P125 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=n-i+1;k++)
			{
				System.out.print((char)(64+k));
			}
			System.out.println();
		}
		
		
	}

}
//ABCDE
//ABCD
// ABC
//  AB
//   A

