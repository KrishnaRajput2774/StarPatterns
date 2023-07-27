package starpatterns11;

public class P220 {
	
	public static void main(String[] args) {
			
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=1;j--) {
				if(i<j) {
					System.out.print("* ");
				}
				else
					System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
//* * * * 1 
//* * * 2 1 
//* * 3 2 1 
//* 4 3 2 1 
//5 4 3 2 1 