package starpatterns12;

public class P221 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(j<=i)
					System.out.print(i+" ");
				else
					System.out.print("* ");
			}
			System.out.println();
		}
		
		
	}

}
//5 5 5 5 5 
//* 4 4 4 4 
//* * 3 3 3 
//* * * 2 2 
//* * * * 1 

