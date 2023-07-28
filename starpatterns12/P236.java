package starpatterns12;

public class P236 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++) {
				if(i>j)
				{
					System.out.print((char)(64+j)+" ");
				}
				else
				{
					System.out.print((char)(64+i)+" ");
				}
			}
			System.out.println();
		}
	}


}
//A B C D E 
//A B C D D 
//A B C C C 
//A B B B B 
//A A A A A 