package starpaterns9;

public class P180 {
	
	public static void main(String[] args) {
		
		int n=5;
		int stars =1;
		
		for(int i=1;i<=n*2-1;i++)
		{
			for(int spaces=Math.abs(n-i);spaces>=1;spaces--)
			{
				System.out.print(" ");
			}
			stars=i;
			if(i>n)
				stars=n*2-i;
			
			for(int cols=1;cols<=stars;cols++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
	}

}
