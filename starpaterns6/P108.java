package starpaterns6;

public class P108 {

	public static void main(String[] args) {
		
		
		int n=5;
		int a,b=1,y=4;
		
		for(int i=n;i>=1;i--)
		{
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			a=b;
			y=i;
			
			for(int j=n;j>=i;j--)
			{
					System.out.print(a);	
					a=a-y;
					y++;
			}
			b=b+i;
			System.out.println();
		}

	}

}
