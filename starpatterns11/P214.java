package starpatterns11;

public class P214 {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--) {
				
				if(i<=j) {
					System.out.print(i+" ");
					continue;
				}
				System.out.print((char)(64+(n-i+1))+" ");
				
			}
			System.out.println();
		}
		
		
		
	}

}
//5 A A A A 
//4 4 B B B 
//3 3 3 C C 
//2 2 2 2 D 
//1 1 1 1 1 
