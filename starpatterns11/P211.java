package starpatterns11;

public class P211 {
	
	public static void main(String[] args) {
		
		int n=5;
		int x;
		
		for(int i=0;i<n;i++) {
			x=i;
			
			for(int j=1;j<=n;j++) {
				
				if(j%2==1)
					x+=1;
				else
					x+=9;
				
				System.out.print((char)(64+x)+"  ");
				
			}
			System.out.println();
		}	
		
	}

}
