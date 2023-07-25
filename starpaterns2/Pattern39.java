package starpaterns2;

public class Pattern39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int r=5;r>=1;r--)
		{
			for(int c=r;c<=n;c++) 
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
/*
5 
4 5 
3 4 5 
2 3 4 5 
1 2 3 4 5 
 */