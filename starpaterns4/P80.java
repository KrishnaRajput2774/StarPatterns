package starpaterns4;

public class P80 {
	public static void main(String[] args) {
		
		
		int n=5,x,y=4;
		for(int i=n;i>=1;i--)
		{
			x=i;
			y=4;
			for(int j=1;j<=i;j++)
			{
				System.out.print(x+" ");
				x=x+y;						//x=x+(i-j);
				y--;						//no need
			}
			System.out.println();
		}
	}

}
//5 9 12 14 15
//4 8 11 13
//3 7 10
//2 6
//1