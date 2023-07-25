package starpaterns7;

public class P138 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<n-i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
	}

}
//A B C D E 
//A B C D 
// A B C 
//  A B 
//   A 

