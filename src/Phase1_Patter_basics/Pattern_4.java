package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_4 {

public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		Pattern_4 p4=new Pattern_4();
		p4.print(row);
	}
	public void print(int row) {
		
		for(int i=1;i<=row;i++) {
			
			for(int j=0;j<i+1;j++) {
				System.out.print(i+" ");}System.out.println();
		} 
	}
	
}
