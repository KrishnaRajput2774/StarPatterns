package starpaterns7;

public class P127 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i =5;i>=1;i--)
		{
			for(int j=5;j>=1;j--)
			{
				if(i>=j)
				{
					System.out.print((char)(64+j));
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
	}

}
