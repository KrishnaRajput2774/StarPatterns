package starpatterns11;

public class P209 {
	
	public static void main(String[] args) {


		int n=5;
		int x = 0;
			
		for(int i=1;i<=n;i++) {
			x=i;
			for(int j=1;j<=n;j++) {
				if(i==j)
					x=0;
				else if(j<=i)
					x--;
				else
					x++;
				
				System.out.print(x+" ");
				
			}
			System.out.println();
		}	
	
		
	}

}
