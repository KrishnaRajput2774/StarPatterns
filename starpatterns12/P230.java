package starpatterns12;

public class P230 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for(int i=n;i>=1;i--)
		{
			for(int j=n;j>=1;j--) {
				
				if(i<j)
					System.out.print("* "); 
				else
					System.out.print((char)(64+j)+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
//E D C B A 
//* D C B A 
//* * C B A 
//* * * B A 
//* * * * A 

