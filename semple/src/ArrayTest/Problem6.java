/*
 * 10개 데이터를 입력받아서 최대값과 최소값을 구하고,
 * 합계를 구하는 프로그램을 작성하세요.
 * 배열이용
 */
package ArrayTest;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = new int[10];
		int min = 0, max = 0, sum = 0;
		for (int i = 0; i < data.length; i++) {
			Scanner input = new Scanner(System.in);
			System.out.printf((i + 1) + "번째 숫자 데이터: ");
			data[i] = input.nextInt();
			sum += data[i];
		}

		System.out.printf("합: " + sum);

		for (int i = 0; i < data.length; i++) {
			if (i == 0) {
				max = data[i];
				min = data[i];
			}
			else if (max < data[i]) {
				max = data[i];
			} else if (min > data[i]) {
					min = data[i];
				}
			}
		System.out.println("최대값: " + max + ", 최소값: " + min);
		}
}
