package starpaterns7;

public class P124 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--)
			{
				
				if(i>=j)
				{
					System.out.print((char)(64+i));
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
		
		
		
//		EEEEE
//		 DDDD
//		  CCC
//		   BB
//		    A

		
		
	}

}
