package starpaterns3;

public class P59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				/*if(i%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");*/
				
				System.out.print(i%2+"  ");
			}
			System.out.println();
		}

	}

}
/*
0  
0  1  
0  1  1  
0  1  1  2  
0  1  1  2  3  
*/
