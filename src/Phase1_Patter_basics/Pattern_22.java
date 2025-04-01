package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_22 {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern_22 p22=new Pattern_22();
		p22.print(n);
	}
	public static void print(int n) {
		int rc=n*2-1;
		for (int i=0;i<rc;i++){
			for(int j=0;j<rc;j++) {
				if(i==0 || j==0 || j==rc-1 || i==rc-1) {
					System.out.print(n);
				}
				else if(i==1 || j==1 || j==rc-2 || i==rc-2) {
					System.out.print(n-1);
				}
				else if(i==2 || j==2 || j==rc-3 || i==rc-3) {
					System.out.print(n-2);
				}
			}
			System.out.println();
		}}}
