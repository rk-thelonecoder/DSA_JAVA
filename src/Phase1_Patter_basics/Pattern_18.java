package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_18 {
public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern_14 p14=new Pattern_14();
		p14.print(n);
		}
public static void print(int n) {
int t=65+n;
char temp=(char)t;
System.out.println(temp+"here");
	for(int i=0;i<n;i++) {
//		char temp=65;
		for(int j=0;j<i+1;j++) {
			System.out.print(temp+" ");
		}
		temp--;
		System.out.println();
	}
}
}
