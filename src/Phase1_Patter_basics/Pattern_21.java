package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_21 {

	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		Pattern_21 p21=new Pattern_21();
		p21.print(n);
	}

	private void print(int n) {
		// TODO Auto-generated method stub
		int row=n*2-2;
		int col=n;
		for(int i=1;i<=row+1;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1 || i==row+1) {System.out.print("*");}
				else if(i%2==0 ) { break;}
				else if(i%2!=0 && (j==1 || j==col)) {System.out.print("*");}
			
				else System.out.print(" ");
			}System.out.println();
		
		}
		
	}
	
}
