package starpaterns4;

public class P64 {
	
	public static void main(String[] args) {
		
		
		
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<=(i+1);j++)
			{
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		
		
	}

}
/*
1  
0  1  
1  0  1  
0  1  0  1  
1  0  1  0  1  
*/
