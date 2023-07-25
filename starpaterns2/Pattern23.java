package starpaterns2;

public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(i%2+"  ");	
			}
			System.out.println();
		}
		
	}

}
/*
1  1  1  1  1  
0  0  0  0  0  
1  1  1  1  1  
0  0  0  0  0  
1  1  1  1  1  

 */
