package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_20 {
	
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	
	Pattern_20 p20=new Pattern_20();
	p20.print(n);
}

public void print(int n) {
    // Write your code here
   int row=n*2-1;
	int col=n*2;
	for(int i=1;i<=row;i++) {
		for(int j=1;j<=col;j++) {
			 if(i<=row/2 && j>=i+1 &&  j<=n*2-i) {
				System.out.print(" ");
			}
			 else if(i>col/2 && j>n*2-i &&  j<=i) 
            {
					System.out.print(" ");
			 }
			 else { System.out.print("* ");}
		}System.out.println();
	}
	
}



}
