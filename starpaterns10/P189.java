package starpaterns10;

public class P189 {
	
	
	public static void main(String[] args) {
		
		
		int n=5;
		int x=1;
		int j=1;
		
		
		for(int i=1;i<=n;i++)
		{
			
			if(i%2==1)
			{
				for(j=1;j<=n;j++)
				{
					System.out.printf("%3d",x++);
				}
				x=x+4;
			}
			else
			{
				for(j=1;j<=n;j++)
				{
					System.out.printf("%3d",x--);
				}
				x=x+6;
			}
			System.out.println();
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i=1;i<=n;i++)
//		{
//			if(i%2==1)
//				for(j=1;j<=n;j++)
//				{
//					System.out.printf("%3d",x);
//					x++;
//				}
//			else
//				for(j=1;j<=n;j++)
//				{
//					System.out.printf("%3d",x);
//					x--;
//				}
//				
//				System.out.println();
//				x+=4;
//		}	
		
		
		
		
	}

}
