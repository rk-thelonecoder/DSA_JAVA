package Phase1_Patter_basics;

import java.util.Scanner;

public class Pattern_17 {

	
		public static void main (String args[]) {
				
				Scanner sc=new Scanner(System.in);
				int row=sc.nextInt();
				Pattern_17 p17=new Pattern_17();
				p17.print(row);
				}
	
		
		private void print(int row) {
			
			int col=row*2-1;
			for(int i=0;i<row;i++) {
				char c=64;
				for(int j=0;j<col;j++) {
					if(j>=((col/2)-i) &&  j<=((col/2)+i) ) {
						if(j>col/2)
						{c--;
						System.out.print(c+" ");}
						else {
						c++;
						System.out.print(c+" ");
						}
					}else 
						System.out.print("  ");
				}System.out.println();
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
}
		
		
		


//	public void print(int n) {
//		// TODO Auto-generated method stub
//		for(int i=1;i<=n;i++) {
//			char asc=64;
//			for(int j=0;j<i*2-1;j++) {
//				if(j<=i/2+1) {
//					asc++;
//					System.out.print(asc);
//					
//				}
//				else if(j>i/2+1)  {
//					asc=(char) (asc-1);
//					System.out.print(asc);
////					asc--;
//				}
//			}System.out.println();
//			
//		}
//		
//	}
//}
//
//	