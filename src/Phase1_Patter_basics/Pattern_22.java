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
		
		for(int i=0;i<n;i++) {
			int temp=n;
			for(int j =0;j<=n*2-1;j++) {
				 if(j<i) {
					 System.out.print(temp);
					 temp--;
				 }
				if(j>=i+1  && j<n*2-i) {
					temp=n-i;
					System.out.print(temp);
				}
				else if (j>=n*2-i && j<=n*2)
					{
					temp++;System.out.print(temp);}
			}System.out.println();//System.out.print
		}
		for(int i=n-2;i>=0;i--) {
			int temp=n;
			for(int j =0;j<=n*2-1;j++) {
				 if(j<i) {
					 System.out.print(temp);
					 temp--;
				 }
				if(j>=i+1  && j<n*2-i) {
					temp=n-i;
					System.out.print(temp);
				}
				else if (j>=n*2-i && j<=n*2)
					{
					temp++;System.out.print(temp);}
			}System.out.println();//System.out.print
			
		}
	}
	}
