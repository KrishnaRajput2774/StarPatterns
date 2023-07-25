package starpaterns7;

public class P136 {
	
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
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
	}
	
//	E E E E E 
//	 D D D D 
//	  C C C 
//	   B B 
//	    A 

	

}
