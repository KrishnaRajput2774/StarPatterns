package starpaterns5;

public class P92 {
	public static void main(String[] args) {
		
		
		int n=5;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++)	// n-i+1 gives one number decrement if n=5 then it will give 5,4,3,2,1 
			{
				System.out.print((char)(n-j+i+64)+" ");		
			}
			System.out.println();
		}
		
		
	}

}
//E D C B A 
//F E D C 
//G F E 
//H G 
//I 
