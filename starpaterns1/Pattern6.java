package starpaterns1;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=4;c++)
			{
				System.out.printf("%3d",i);
				i++;
			}
			System.out.println();
		}

	}

}
/*
 * 1  2  3  4 
 * 5  6  7  8 
 * 9  10 11 12
 * 13 14 15 16
 */
