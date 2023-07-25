package starpaterns10;

public class P181 {

	public static void main(String[] args) {
		
		int n=4;
		int num=1;
		
		for(int i=1;i<=n*2-1;i++)
		{
			for(int j=Math.abs(n-i);j>=1;j--)
			{
				System.out.print(" ");
			}
			num=i;
			if(i>n)
				num=n*2-i;
			
			for(int k=1;k<=num;k++)
			{
				System.out.print(4-k);
			}
			System.out.println();
		}
		
		

	}

}
