package starpaterns5;

public class P93 {
	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print((char)(n-i+j+64)+" ");
			}
			System.out.println();
		}
		
		
	}

}
//E F G H I 
//D E F G 
//C D E 
//B C 
//A 
