package starpatterns12;

public class P229 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(j>i)
					System.out.print("* ");
				else
					System.out.print((char)(64+i)+" ");
			}
			System.out.println();
		}		
	}
}
//E E E E E 
//* D D D D 
//* * C C C 
//* * * B B 
//* * * * A 