package starpaterns5;

public class P89 {
	public static void main(String[] args) {
		
		int n=5;
		
		for(char ch='E';ch>='A';ch--)
		{
			for(char j='A';j<=ch;j++)
			{
				System.out.print(ch+" ");
			}
			System.out.println();
		}
		
	}

}
//E E E E E 
//D D D D 
//C C C 
//B B 
//A 

