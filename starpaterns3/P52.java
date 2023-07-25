package starpaterns3;

public class P52 {
	
	public static void main(String[] args) {
		
		
		
	int n=5;
	int a=5,b=0,c;
	
	for(int i=n;i>=1;i--)
	{
		c=b+=i;
		
		for(int j=n;j>=i;j--)
		{
			
			System.out.print(c+" ");
			c=c-a;
			a++;
		}
		a=i-2;
		System.out.println();
		
	}
		
		
	
	}

}
/*
1 
6 2 
10 7 3 
13 11 8 4 
15 14 12 9 5 
*/
