package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_8 {
	
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int row=scan.nextInt();
//	int col=scan.nextInt();
	Pattern_8 p8=new Pattern_8();
	p8.printTriangle(row);
}

	   void printTriangle(int n) {
	        // code here
	        int col=n*2-1;
		for(int i=0;i<=n-1;i++) {
			for(int j=1;j<col;j++) {
				if(j>=((col/2)-i) &&  j<=((col/2)+i)) {
					System.out.print("*");
				}else if(j!=col-1)
					System.out.print(" ");
			}System.out.println();
		}
	
}
}
