package starpaterns7;

public class P135 {
	
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
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
//		5 4 3 2 1 
//		 4 3 2 1 
//		  3 2 1 
//		   2 1 
//		    1 

		
		
		
	}

}
