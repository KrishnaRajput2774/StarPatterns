package starpatterns11;

public class P217 {
	
	public static void main(String[] args) {
		

		
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++) {
				if(i>=j)
					System.out.print(i+" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}	
	}
}
//5 5 5 5 5 
//4 4 4 4 * 
//3 3 3 * * 
//2 2 * * * 
//1 * * * * 