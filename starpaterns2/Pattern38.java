package starpaterns2;

public class Pattern38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		
		for(int r=n;r>=1;r--)
		{
			for(int c=n;c>=r;c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
/*
5 
5 4 
5 4 3 
5 4 3 2 
5 4 3 2 1 
*/
