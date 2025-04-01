package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int row=scan.nextInt();
		Pattern_2 p2=new Pattern_2();
		p2.print(row);
		
		
	}
	
	public void print(int row) {
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<i+1;j++) {
				System.out.print("* ");}
			System.out.println( );
		}
		
		
	}
}
