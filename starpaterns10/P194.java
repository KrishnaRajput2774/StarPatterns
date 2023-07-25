package starpaterns10;

public class P194 {public static void main(String[] args) {
	
	
	int  n=5;
	int x;
	
	for(int i=1;i<=n;i++)
	{
		x=5;
		
		for(int j=1;j<=n;j++)
		{
			if(i-1>=j)
				System.out.print(1+" ");
			else
				System.out.print(x--+" ");
		}
		System.out.println();
	}
	
//	5 4 3 2 1 
//	1 5 4 3 2 
//	1 1 5 4 3 
//	1 1 1 5 4 
//	1 1 1 1 5 

	
}


}
