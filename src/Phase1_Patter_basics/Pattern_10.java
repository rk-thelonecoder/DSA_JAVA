package Phase1_Patter_basics;

import java.util.Scanner;
//**Half Diamond Star Pattern**
public class Pattern_10 {
	
        
	public static void main (String args[]) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Pattern_10 p10=new Pattern_10();
		p10.print(n);
		}
	public static void print(int n) {
		int k=0;
		for(int i=0;i<n*2-1;i++) {
			if(i<n)k=i;
			if(i==n)k=n-1;
			for(int j=0;j<k+1;j++) {
				if(i<n)
				System.out.print("*");
				else {System.out.print("*");
				k--;
				}
			}System.out.println();
		}
	}
}
