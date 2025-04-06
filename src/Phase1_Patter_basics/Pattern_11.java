package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_11 {
public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern_11 p11=new Pattern_11();
		p11.print(n);
		}
public static void print(int n) {
 	for(int i=1;i<=n;i++) {
 		
 		for (int j=0;j<i;j++) {
 			if((i%2==0 && j%2!=0) ||  (i%2!=0 && j%2==0)){
 				System.out.print("1 ");
 			}else System.out.print("0 ");
 			
 		}System.out.println();
 		
 	}
}
}
