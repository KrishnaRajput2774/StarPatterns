package starpaterns5;

public class P81 {
	
	
	public static void main(String[] args) {
		int n=5;		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i%2+" ");
			}
			System.out.println();
		}	
	}
}
//1 1 1 1 1
//0 0 0 0
//1 1 1
//0 0
//1
