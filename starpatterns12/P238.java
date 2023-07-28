package starpatterns12;

public class P238 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++) {
				if(i>j)
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
//E E E E E 
//D D D D E 
//C C C D E 
//B B C D E 
//A B C D E 

