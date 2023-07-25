package starpaterns1;

public class Pattern9 {
	public static void main(String[] args) {
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.printf("%3d",c*r);
			}
			System.out.println();
		}
		
	}

}
/*
 
  1  2  3  4
  2  4  6  8
  3  6  9 12
  4  8 12 16

 
 
 */
