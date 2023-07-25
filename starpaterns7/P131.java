package starpaterns7;

public class P131 {
	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int k=1;k<=n-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}
	
//	    A 
//	    B B 
//	   C C C 
//	  D D D D 
//	 E E E E E
		
	}

}
