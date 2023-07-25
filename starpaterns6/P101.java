package starpaterns6;

public class P101 {
	
	public static void main(String[] args) {
		
		
		
		int n=5;
		int x=2;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++) 
			{
				if(j>n-i)
				{
					System.out.print(x);
					x+=2;
				}
				else
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}
		
		
	}

}
/*
      			2
    		 4  6
  		  8 10 12
  	  14 16 18 20
   22 24 26 28 30*/
