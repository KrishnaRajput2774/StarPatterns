package starpaterns2;

public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char c;
		
		for(char ch='E';ch>='A';ch--)
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
E J O T Y 
D I N S X 
C H M R W 
B G L Q V 
A F K P U 
*/