package starpaterns4;

public class P78 {
	
	public static void main(String[] args) {
		
		int x=15;
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(x--+" ");
			}
			System.out.println();
		}
		
		
	}

}
//15 14 13 12 11 
//10 9 8 7 
//6 5 4 
//3 2 
//1 
