package starpaterns9;

public class P173 {
	
	public static void main(String[] args) {
		
		int n=4;
		int num=1;
		
		for(int i=1;i<=n*2-1;i++)
		{
			num=i;
			if(i>n)
				num=n*2-i;
			
			for(int j=1;j<=num;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		
		
	}

}
//1
//12
//123
//1234
//123
//12
//1

