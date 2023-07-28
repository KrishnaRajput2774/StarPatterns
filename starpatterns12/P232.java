package starpatterns12;

public class P232 {
	
	public static void main(String[] args) {
		
		
		int n = 5 ;
		
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n;j++) {
				if(i>j)
					System.out.print(j+" ");
				else
					System.out.print(i+" ");
			}
			System.out.println();
		}
	}
}
//1 2 3 4 5 
//1 2 3 4 4 
//1 2 3 3 3 
//1 2 2 2 2 
//1 1 1 1 1 