package starpatterns11;

public class P207 {
	
	public static void main(String[] args) {

		
		
		int n=5;
			
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j)
					System.out.print(1+" ");
				else
					System.out.print(0+" ");
				
			}
			System.out.println();
		}	
	}
}
//1 0 0 0 0 
//1 1 0 0 0 
//1 1 1 0 0 
//1 1 1 1 0 
//1 1 1 1 1 

