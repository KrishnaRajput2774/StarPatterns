package starpatterns11;

public class P210 {
	
	public static void main(String[] args) {
		
		int n=5;
			
		for(int i=n;i>=1;i--) {
			
			for(int j=1;j<=n;j++) {
				
				System.out.print(Math.abs(i-j)+" ");
				
			}
			System.out.println();
		}	
		
		
	}

}
