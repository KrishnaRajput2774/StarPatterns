package starpaterns10;

public class P188 {
	public static void main(String[] args) {
		int n=5;
		int j=1;
		for(int i=1;i<=n;i++)
		{
			if(i%2==1)
				for(j=1;j<=n;j++)
					System.out.print(j+" ");
			
			else
				for(j=n;j>=1;j--)
					System.out.print(j+" ");
				
			System.out.println();
		}
	}

}
