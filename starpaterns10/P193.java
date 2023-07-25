package starpaterns10;

public class P193 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(n-i+1<j)
					System.out.print(i+" ");
				
				else
					System.out.print(1+" ");
			}
			System.out.println();
		}
		
//		1 1 1 1 1 
//		1 1 1 1 2 
//		1 1 1 3 3 
//		1 1 4 4 4 
//		1 5 5 5 5 

		
		
		
	}



}
