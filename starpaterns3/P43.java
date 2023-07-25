package starpaterns3;

public class P43 {

	public static void main(String[] args) {
		
		int n=5,x;
		
		for(int i=1;i<=9;i+=2)
		{
			x=i;
			for(int j=1;j<=i;j+=2)
			{
				System.out.print(x+" ");
				x+=2;
			}
			System.out.println();
		}

	}

}
/*
1 
3 5 
5 7 9 
7 9 11 13 
9 11 13 15 17 
*/