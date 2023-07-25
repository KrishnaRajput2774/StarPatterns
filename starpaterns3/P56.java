package starpaterns3;

public class P56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x=4,y=1;
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			x=4;
			y=i;
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(y+"  ");
				y=y+x;
				x--;
				
			}
			System.out.println();
		}
		

	}

}
/*
1  
2  6  
3  7  10  
4  8  11  13  
5  9  12  14  15  
*/
