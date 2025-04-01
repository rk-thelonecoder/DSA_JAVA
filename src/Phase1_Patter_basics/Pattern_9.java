package Phase1_Patter_basics;

public class Pattern_9 {

	
	
	 void printTriangle(int n) {
	        // code here
	    int col=n*2-1;
		for(int i=n-1;i>=0;i--) {
			for(int j=0;j<col;j++) {
				if(j>=((col/2)-i) &&  j<=((col/2)+i)) {
					System.out.print("*");
				}else if(j!=col-1)
					System.out.print(" ");
			}System.out.println();
		}
	
}
	
}
