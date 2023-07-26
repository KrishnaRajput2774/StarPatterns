package starpaterns10;

public class P199 {
	static int number=1;
	
	public static int getNextPrimeNumber()
	{		
		int i;
		while(true) 
		{
			number++;
			for(i=2;i<number;i++)
			{
				if(number%i==0)
				{
					break;
				}
			}
			
			if(number==i) {
				return number;
			}
		}
		
		
			
		
	}
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(getNextPrimeNumber()+" ");
			}
			System.out.println();
		}
		
		
	}

}
