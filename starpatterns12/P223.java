package starpatterns12;

public class P223 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=1;i<=n;i++) {
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
//A * * * * 
//B B * * * 
//C C C * * 
//D D D D * 
//E E E E E 

