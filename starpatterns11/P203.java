package starpatterns11;

public class P203 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		int x=1;
		
		for(int i=1;i<=n;i++) {
			x=i*2-1;
			for(int j=1;j<=n;j++) {
				
				if(i-1>=j) 
					System.out.printf("%2d",0);
				else
					System.out.printf("%2d",x++);
				}
			System.out.println();
		}
	}

}
//1 2 3 4 5
//0 3 4 5 6
//0 0 5 6 7
//0 0 0 7 8
//0 0 0 0 9

