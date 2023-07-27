package starpatterns11;

public class P201 {
	
	public static void main(String[] args) {
		
		int n=4;
		int x=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(x+++" ");//System.out.printf("%3o",x++);
				if(x%10==8)
					x+=2;
			}
			System.out.println();
		}
		
		
		
	}

}
//1 2 3 4 
//5 6 7 10 
//11 12 13 14 
//15 16 17 20 

