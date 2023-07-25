package starpaterns7;

public class P134 {
	
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
				System.out.print(i+" ");
			}
			System.out.println();
		}
//		5 5 5 5 5 
//		 4 4 4 4 
//		  3 3 3 
//		   2 2 
//		    1 

		
		
	}

}
