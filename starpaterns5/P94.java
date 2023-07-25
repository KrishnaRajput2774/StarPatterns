package starpaterns5;

public class P94 {
	public static void main(String[] args) {
		
		int x=1;
		int n=10;
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(x>=27)	
				{
					x=1;
				}
				System.out.print((char)(64+x)+" ");
				x++;
				
			}
			System.out.println();
		}
		
	}

}
//A 
//B C 
//D E F 
//G H I J 
//K L M N O 
//P Q R S T U 
//V W X Y Z A B 
//C D E F G H I J 
//K L M N O P Q R S 
//T U V W X Y Z A B C 
