package starpatterns11;

public class P219 {
	
	public static void main(String[] args) {

		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
				if(n-i>=j)
					System.out.print("* ");
				else
					System.out.print(i+" ");
			}
			System.out.println();
		}
	
	}

}
