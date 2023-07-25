package starpaterns3;

public class P60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print(i%2+"  ");
			}
			System.out.println();
		}

	}

}
/*
0  
1  1  
0  0  0  
1  1  1  1  
0  0  0  0  0  
*/
