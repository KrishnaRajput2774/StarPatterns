package starpatterns12;

public class P228 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(j>i)
					System.out.print("* ");
				else
					System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		
		
	}

}
//* * * * A 
//* * * B A 
//* * C B A 
//* D C B A 
//E D C B A 

