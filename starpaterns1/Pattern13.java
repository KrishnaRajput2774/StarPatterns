package starpaterns1;

public class Pattern13 {
	
	public static void main(String[] args) {
		
		
/*		
		int a=9,b=1,c=1;
		
		for(int i=1;i<=5;i++)
		{
			System.out.print(i+"  ");
			c=i;
			for(int j=1;j<=4;j++)
			{
				if(j%2!=0)
				{
					c+=a;
					System.out.print(c+"  ");
				}
				else
				{
					c+=b;
					System.out.print(c+"   ");
				}
			}
			a-=2;
			b+=2;
			System.out.println();
		}
		
		
	}

}
*/
int n=6;
int x;
int y;
for(int i=1;i<=n;i++)
{
	x=i; //x=1 //x=2
	y=n-i+1;//6-1+1=6   //6+1-2=5
	
	for(int j=1; j<=n;j++)
	{
		if(j%2==1)
		{
			System.out.printf("%3d",x);//1 13  25
		}
		else
		{
			System.out.printf("%3d",y);//12  24  36
		}
		x+=n;//1+6=7  7+6=13    13+6=19  19+6=25   25+6=31 //
		y+=n;//6+6=12  12+6=18  18+6=24   24+6=30 30+6=36  //
		
	}
	System.out.println();
}
	}
	}
/*
1  10  11   20  21   
2  9  12   19  22   
3  8  13   18  23   
4  7  14   17  24   
5  6  15   16  25   

*/
