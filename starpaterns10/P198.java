package starpaterns10;

public class P198 {
	
	public static void main(String[] args) {
		
		int n=5;
		int x=1,y=1;
		
		
		for(int i=1;i<=n;i++){
			x=y;
			for(int j=1;j<=n;j++) {
				
				System.out.printf("%3d",x++);
				
			}
			System.out.println();
			if(i==n/2+1) {
				y-=5;
			}
			else if(i>n/2+1) {
				y-=10;
			}
			else {
				y+=10;
			}
			
			
		}
		
	}

}
//1  2  3  4  5
//11 12 13 14 15
//21 22 23 24 25
//16 17 18 19 20
//6  7  8  9 10

