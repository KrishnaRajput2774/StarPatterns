package starpaterns6;

public class P110 {
	
	public static void main(String[] args) {
		
		int n=7;
		int ans=n;
		int oddinc;
		int eveninc=2;
		int rowinc=n+(n-4),temprowinc=n;
		
		
		for(int i=n;i>=1;i--)
		{
			oddinc=i*2-1;
			for(int k=1;k<=i-1;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=n-i+1;j++)
			{
				
				
				if((i+j)%2==0)
				{
					System.out.print(ans+" ");
					ans=ans-oddinc;
				}
				else
				{
					System.out.print(ans+" ");
					ans=ans-eveninc;
					eveninc+=4;
				}
					
			}
			System.out.println();
			if((n-i+1)%2==1)
			{
				temprowinc++;
				ans=temprowinc;
				eveninc=2;
			}
			else
			{
				temprowinc+=rowinc;
				rowinc-=4;
				ans=temprowinc;
				eveninc=4;
			}
			
		}
		
		
	
			
	
	}

}
