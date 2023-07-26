package starpaterns10;

public class P200 {
	public static void main(String[] args) {
		
		int n=3;
		int x=1;
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.printf("%5s",Integer.toBinaryString(x++));
			}
			System.out.println();
		}
		
		
	}

}
