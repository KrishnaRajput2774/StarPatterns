package starpatterns12;

public class P237 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
				if(i>=j)
				{
					System.out.print((char)(64+i)+" ");
				}
				else
				{
					System.out.print((char)(64+j)+" ");
				}
			}
			System.out.println();
		}
	}
}
//A B C D E 
//B B C D E 
//C C C D E 
//D D D D E 
//E E E E E 