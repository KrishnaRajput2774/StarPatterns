package starpaterns5;

public class P98 {
	
	public static void main(String[] args) {
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("_");
			}
			for(int k=n;k>=i;k--) {
				System.out.print(i);
			}
			System.out.println();
		}

	}
	
}
//____5
//___44
//__333
//_2222
//11111

