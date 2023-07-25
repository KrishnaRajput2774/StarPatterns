package starpaterns5;

public class P87 {
	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print((char)(i+64)+" ");
			}
			System.out.println();
		}
		
		
	}

}
//A A A A A 
//B B B B 
//C C C 
//D D 
//E 

