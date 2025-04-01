package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int col=scan.nextInt();
		Pattern_6 p6=new Pattern_6();
		p6.print(row, col);
	}

	private void print(int row, int col) {
		for(int i=row;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}System.out.println();
		}
		
	}
	
}
