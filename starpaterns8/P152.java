package starpaterns8;

public class P152 {
	public static void main(String[] args) {
		int n=5,x=1,z=1;
		
		for(int i=n;i>=1;i--)
		{
			x=i;
			for(int k=1;k<i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=z;j++)
			{
				System.out.print(x);
				
				if((n-i)>=j)
					x++;
				else
					x--;
			}
			z+=2;
			System.out.println();
		}
	}

}
