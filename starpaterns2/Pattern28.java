package starpaterns2;

public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char ch = 'E';ch>='A';ch--)
		{
			for(char c ='A';c<='E';c++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
			

	}

}
/*
E E E E E 
D D D D D 
C C C C C 
B B B B B 
A A A A A  
 */