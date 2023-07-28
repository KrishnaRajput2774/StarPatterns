package starpatterns12;

public class P240 {
	

	
	public static void main(String[] args) {
		
		int n=5;
		int x=1;
		
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
				if((i+j)%2==0) {
					System.out.printf("%2s","*");
				}
				else
					System.out.printf("%2d",x++);
			}
			System.out.println();
		}
	}


}
//*  1  *  2   *
//3  *  4  *   5
//*  6  *  7   *
//8  *  9  *   10
//* 11  *  12  *

