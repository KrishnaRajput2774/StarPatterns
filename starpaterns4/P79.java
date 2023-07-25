package starpaterns4;

public class P79 {
	
	public static void main(String[] args) {
		
		int x,y=17,n=4;
		
		for(int i=n;i>=1;i--)
		{
			x=y;
			for(int j=i;j>=1;j--)
			{
				System.out.print(x+++" ");
			}
			y=y-(i-1);
			System.out.println();
		}
		
		
		
		
	}
}

//17 18 19 20
//14 15 16
//12 13
//11