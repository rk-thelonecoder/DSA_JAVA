package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_15 {
public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern_15 p15=new Pattern_15();
		p15.print(n);
		}
public static void print(int n) {
 	
//	char temp=65;
	for(int i=n-1;i>=0;i--) {
		char temp=65;
		for(int j=0;j<i+1;j++) {
			System.out.print(temp+" ");
			temp++;
			
		}System.out.println();
	}
}
}
