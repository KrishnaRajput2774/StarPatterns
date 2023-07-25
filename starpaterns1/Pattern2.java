
package starpaterns1;

public class Pattern2 {
	
	public static void main(String[] args) {
		for(int a=1;a<=4;a++)
		{
			for(int b=1;b<=4;b++)
			{
				System.out.print(a+" ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println();
		}
	}

}
