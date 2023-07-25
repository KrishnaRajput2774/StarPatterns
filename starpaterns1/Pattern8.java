package starpaterns1;

public class Pattern8 {
	
	public static void main(String[] args) {
		
		int i=2;
		
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.printf("%3d",i);
				i+=2;
			}
			
			System.out.println();
		}
		
		
	}

}
/*
  2  4  6  8
 10 12 14 16
 18 20 22 24
 26 28 30 32
*/