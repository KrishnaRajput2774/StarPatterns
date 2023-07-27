package starpatterns11;

public class P212 {
	
	public static void main(String[] args) {
		
		int n=5;
		int x;
		
		for(int i=n;i>=1;i--) {
			x=i;
			
			for(int j=1;j<=n;j++) {
				
				System.out.print((char)(64+x)+" ");
				
				if(j%2==1)
					x+=1;
				else
					x+=9;
				
			}
			System.out.println();
		}	
		
	}
}
//E F O P Y 
//D E N O X 
//C D M N W 
//B C L M V 
//A B K L U 

