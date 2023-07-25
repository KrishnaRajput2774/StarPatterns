package starpaterns5;

public class P85 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
		
	}

}
//0 1 0 1 0 
//1 0 1 0 
//0 1 0 
//1 0 
//0 
