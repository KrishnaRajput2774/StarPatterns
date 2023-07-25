package starpaterns6;

public class P11 {
	
	public static void main(String[] args) {
		
		
		
		int n=5;
		int temp=0;
		int cinc=n;
		int ans;
		
		for(int i=n;i>=1;i--)
		{
			temp+=i;
			ans=temp;
			for(int k=1;k<=i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=n-i+1;j++)
			{
				System.out.print(ans);
				ans-=cinc;
				cinc++;
			}
			System.out.println();
			cinc=i;
			
		}
		
		
		
		
	}

}
