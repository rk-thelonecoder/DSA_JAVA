package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_5 {

	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		int col=scan.nextInt();
		Pattern_5 p5=new Pattern_5();
		p5.print(row, col);
		p5.print_2(row, col);
	}
	
	public void print(int row,int col) {
		
		for(int i=0;i<row;i++) {
			for(int j=col;j>i;j--) {
				System.out.print("* ");
			}System.out.println();
		}
	}
	public void print_2(int row,int col) {
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row-i+1;j++) {
				System.out.print("* ");
			}System.out.println();
			
		}
	}
}

