package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_7 {

public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int col=scan.nextInt();
		Pattern_7 p7=new Pattern_7();
		p7.print(row, col);
	}

	private void print(int row, int col) {
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(j>=((col/2)-i) &&  j<=((col/2)+i)) {
					System.out.print("* ");
				}else 
					System.out.print("  ");
			}System.out.println();
		}
		
	}
	
}
