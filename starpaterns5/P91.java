package starpaterns5;

public class P91 {
	
	public static void main(String[] args) {
		
		
		int x=64;
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print((char)(x+j)+" ");
			}
			System.out.println();
			x--;
		}
		
		
	}

}
//E D C B A 
//D C B A 
//C B A 
//B A 
//A 


