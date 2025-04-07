package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_16 {
public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern_16 p16=new Pattern_16();
		p16.print(n);
		}
public static void print(int n) {
 	
	char temp=65;
	for(int i=0;i<n;i++) {
//		char temp=65;
		for(int j=0;j<i+1;j++) {
			System.out.print(temp);
		}temp++;System.out.println();
	}
}
}
