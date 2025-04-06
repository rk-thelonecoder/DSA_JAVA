package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_13 {

public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern_13 p11=new Pattern_13();
		p11.print(n);
		}
public static void print(int n) {
 	
	int temp=1;
	for(int i=0;i<n;i++) {
		
		for(int j=0;j<i+1;j++) {
			System.out.print(temp+" ");
			temp++;
			
		}System.out.println();
	}
}
}
