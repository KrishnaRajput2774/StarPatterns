package starpaterns2;

public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c='A';
		
		for(char ch='A';ch<='E';ch++)
		{
			c=ch;
			for(int i=0;i<5;i++)
			{
				System.out.print(c+" ");
				c+=5;
			}
			System.out.println();
		}

	}

}
/*
A F K P U 
B G L Q V 
C H M R W 
D I N S X 
E J O T Y 
 */
