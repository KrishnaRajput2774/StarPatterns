package starpaterns2;

public class Pattern40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n=10;
		
		for(int r=2;r<=n;r+=2)
		{
			for(int c=2;c<=r;c+=2)
			{
				System.out.print(c+"  ");
			}
			System.out.println();
		}
	}

}
/*
2  
2  4  
2  4  6  
2  4  6  8  
2  4  6  8  10   
*/