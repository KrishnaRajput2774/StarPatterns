package starpatterns11;

public class P213 {
	
	public static void main(String[] args) {
		
		int n=5;
		int x;
		
		for(int i=1;i<=n;i++) {
			x=i;
			for(int j=1;j<=n;j++){
				
				if(x==6) {
					x=1;
				}
				System.out.print((char)(64+x)+" ");	
				x++;
			}
			System.out.println();
		}
		
		
	}

}
//A B C D E 
//B C D E A 
//C D E A B 
//D E A B C 
//E A B C D 

