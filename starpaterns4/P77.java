package starpaterns4;

public class P77 {
	public static void main(String[] args) {
		
		
		
		int x=1;
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+++"  ");
			}
			System.out.println();
				
		}
		
		
	}

}
//1  2  3  4  5  
//6  7  8  9  
//10  11  12  
//13  14  
//15  