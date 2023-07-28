package starpatterns12;

public class P225 {
	
	public static void main(String[] args) {
		
		int n=5;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=n;j++) {
				if(i>=j)
					System.out.print((char)(64+i)+" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
//E E E E E 
//D D D D * 
//C C C * * 
//B B * * * 
//A * * * * 