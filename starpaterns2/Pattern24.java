package starpaterns2;

public class Pattern24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(j%2+"  ");
			}
			System.out.println();
		}

	}

}
/*
0  1  0  1  0  
0  1  0  1  0  
0  1  0  1  0  
0  1  0  1  0  
0  1  0  1  0  
*/