package starpaterns3;

public class P41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=4,x=1;
		
		for(int r =1;r<=n;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(x+++"  ");
			}
			System.out.println();
		}

	}

}
/*
1  
2  3  
4  5  6  
7  8  9  10  
 */
