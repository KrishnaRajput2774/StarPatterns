package starpaterns10;

public class P185 {
	
	public static void main(String[] args) {
		
		int n=4;
		
		for(int i=(n-1);i>=-(n-1);i--)
		{
			for(int s=Math.abs(i);s>=1;s--)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=(n-Math.abs(i));j++) {
				System.out.print((char)(64+Math.abs(i)+j));
			}
			
			System.out.println();
		}
		
		
		
		
	}

}
