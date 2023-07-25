package starpaterns10;	

public class P192 {
	
	public static void main(String[] args) {
		
		int n=5,y,x;
		for(int i=1;i<=n;i++)
		{
			x=i;
			y=i-1;
			
			for(int j=1;j<=n;j++)
			{
				if(x<=5)
					System.out.print(x+++" ");				
				else
					System.out.print(y--+" ");


			}
			System.out.println();
		}
		
	}
//	1 2 3 4 5 
//	2 3 4 5 1 
//	3 4 5 2 1 
//	4 5 3 2 1 
//	5 4 3 2 1 


	
	}
