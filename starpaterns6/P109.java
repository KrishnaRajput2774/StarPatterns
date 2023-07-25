package starpaterns6;

public class P109 {
	
	public static void main(String[] args) {
		
		int n=7;
		int ans=1;				//answer
		int rowinc=n+(n-2);//12
		int temprowinc=ans;
		int oddinc;
		int evenicn=2;
		
		for(int i=n;i>=1;i--)
		{
			oddinc=i*2-1;
			ans=temprowinc;
			
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int k=n;k>=i;k--)
			{
				if((i+k)%2==1)
				{
					System.out.print(ans+"  ");
					ans=ans-oddinc;
					
				}
				else
				{
					System.out.print(ans+"  ");
					ans=ans-evenicn;
					evenicn+=4;
				}
					
				
			}
			if((n-i+1)%2==1)
			{
				temprowinc+=rowinc;
				rowinc-=4;
				evenicn=4;
			}
			else
			{
				evenicn=2;
				temprowinc++;
			}
			System.out.println();
		}
		

	}

}
