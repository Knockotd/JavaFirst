/*
 * 10개의 데이터를 입력받아, 총점을 구하는 프로그램을
 * 작성해 봅니다. 배열사용.
 */

package ArrayTest;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] args) {
		
		int sung[] = new int [10];
		int total = 0;
		System.out.println("배열 방에 넣을 값을 입력하세요.(10개)");
		System.out.println("*참고: 하나의 데이터 값은 엔터로 구분.");
		System.out.printf("sung array = ");
		for(int j =0; j < sung.length; j++) {
			Scanner input = new Scanner(System.in);
			sung[j] = input.nextInt();
			total += sung[j];
			
		}
		
	
		System.out.println("총점은 = " + total);
		System.out.println("평균은 = " + total/sung.length);
		
	}
}
