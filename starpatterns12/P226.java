package starpatterns12;

public class P226 {
	
	public static void main(String[] args) {
		
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) {
				if(n-i+1>=j)
					System.out.print((char)(64+j)+" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
	
	}

}
//A B C D E 
//A B C D * 
//A B C * * 
//A B * * * 
//A * * * * 
