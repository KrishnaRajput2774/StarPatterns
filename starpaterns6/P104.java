package starpaterns6;

public class P104 {
	
	public static void main(String[] args) {
		
		int n=5;
		int x=1;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("_");
			}
			
					System.out.println(x);
					x=x*11;
			}
		
		
	}
}
//____1
//___11
//__121
//_1331
//14641
