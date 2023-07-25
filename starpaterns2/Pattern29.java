package starpaterns2;

public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(char ch='A';ch<='E';ch++)
		{
			for(char c='E';c>='A';c--)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}

	}

}
/*
E D C B A 
E D C B A 
E D C B A 
E D C B A 
E D C B A 

 */
