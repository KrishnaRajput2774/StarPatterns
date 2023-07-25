package starpaterns1;

public class Pattern12 {
	
	public static void main(String[] args) 
	{
		int i=1;
		
		for(int r=1;r<=5;r++)
		{
			i=r;
			for(int c=1;c<=5;c++)
			{
				System.out.printf("%3d",i);
				i+=5;
			}
			System.out.println();
		}
		
		
		
		
	}

}
