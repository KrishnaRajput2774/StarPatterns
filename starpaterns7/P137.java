package starpaterns7;

public class P137 {
	
	public static void main(String[] args) {
		

		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<n-i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--)
			{
				System.out.print((char)(j+64)+" ");
			}
			System.out.println();
		}
		
		
	}

}
//E D C B A 
//D C B A 
// C B A 
//  B A 
//   A 
