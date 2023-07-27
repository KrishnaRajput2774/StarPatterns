package starpatterns11;

public class P204 {
	
	
	public static void main(String[] args) {
		
		int n=5;
		int x=1;
		
		for(int i=1;i<=n;i++) {
			x=i;
			for(int j=1;j<=n;j++) {
				if(x>5)
					x=1;
				System.out.printf("%2d",x++);
			}
			System.out.println();
		}
	}
}
//1 2 3 4 5
//2 3 4 5 1
//3 4 5 1 2
//4 5 1 2 3
//5 1 2 3 4

