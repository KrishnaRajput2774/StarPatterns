package starpaterns3;

public class P58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int i=0;i<=n-1;i++)
		{
			int a=1;
			int x=0,y=1;
			System.out.print(0+"  ");
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(a+"  ");
				a=x+y;
				x=y;
				y=a;
				
			}
			System.out.println();
		}

	}

}
