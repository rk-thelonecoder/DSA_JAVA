package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_19 {
	
public static void main(String args[]) {
		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		Pattern_19 p7=new Pattern_19();
		p7.print(n);
	}
	
	private void print(int n) {
		int row=n*2;
		int col=n*2;
		int temp=-1;
		int tempDown=n*2-2;
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=col;j++) {
				if(i==1 || i==n*2) {System.out.print("*"); }
				else if(i<=col/2 && j>=(col/2)-temp &&  j<=(col/2)+(temp+1)) {
//					System.out.print("k");
					System.out.print(" ");
					
				}
				else if(i>col/2 && j>=(col/2)-tempDown &&  j<=(col/2)+(tempDown+1)) {
//					System.out.print("L");
					System.out.print(" ");
				}
					
					else System.out.print("*");
			}System.out.println();temp++;tempDown--;//System.out.println("temp:"+temp);
		}
		
	}
	
	
//	if(j>=((col/2)-i) &&  j<=((col/2)+i)) {
//		System.out.print(" ");
//	}else 
//		System.out.print("*");
	
}
