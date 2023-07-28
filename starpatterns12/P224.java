package starpatterns12;

public class P224 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j)
					System.out.print((char)(64+j)+" ");
				else
					System.out.print("* ");
				
			}
			System.out.println();
		}
		
		
	}
}
//A * * * * 
//A B * * * 
//A B C * * 
//A B C D * 
//A B C D E 
