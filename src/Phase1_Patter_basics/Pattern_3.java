package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_3 {

	
	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		Pattern_3 p3=new Pattern_3();
		p3.print(row);
	}
	public void print(int row) {
		
		for(int i=1;i<=row;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(j+" ");}System.out.println();
		} 
	}
}
