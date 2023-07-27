package starpatterns11;

public class P206 {
	
	public static void main(String[] args) {
		
		
		int n=7;
	
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i<=n/2)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
				
			}
			System.out.println();
		}	
	}

}
//0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 
//0 0 0 0 0 0 0 
//1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 
//1 1 1 1 1 1 1 