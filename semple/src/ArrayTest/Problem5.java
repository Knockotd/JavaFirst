package ArrayTest;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
	
		int a[][] = new int [8][9];
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<9; j++) {
					a[i][j] = (i+2)*(j+1);
				//	System.out.println((i+2)+" * "+(j+1)+" = "+a[i][j]);
			}
			System.out.println(" ");
		}
Scanner sc = new Scanner(System.in);
int dan = sc.nextInt();

for(int i=1; i<10; i++) {
	System.out.println(dan +" * "+i+" = "+a[dan][i-1]);
}
	}

}
