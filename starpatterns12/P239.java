package starpatterns12;

public class P239 {
		
		public static void main(String[] args) {
			
			int n=5;
			
			for(int i=n;i>=1;i--)
			{
				for(int j=1;j<=n;j++) {
					if(i==j)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(j+" ");
					}
				}
				System.out.println();
			}
		}	
	}
//1 2 3 4 * 
//1 2 3 * 5 
//1 2 * 4 5 
//1 * 3 4 5 
//* 2 3 4 5 
