package starpaterns1;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
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
   1  3  5  7
  9 11 13 15
 17 19 21 23
 25 27 29 31
 
 */
