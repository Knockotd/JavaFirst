/*
 다섯명의 학생 성적을 입력 받아서
 1. 합계와 평균을 구하되, 각 과목별 총점과 평균을 구하여 출력해 주세요.
 */
package ArrayTest;

import java.util.Scanner;

public class Problem3 {

	public static void main(String[] args) {

		int sung[][] = new int[5][5];
		int total[] = new int[5];
		int aver[] = new int[5];
		String name[] = new String[5];
		String gua[] = { "국어", "영어", "수학", "사회", "과학" };

		for (int i = 0; i < name.length; i++) {
			System.out.printf("이름, 국어, 영어, 수학, 사회, 과학 성적을 입력하세요.\n");
			System.out.printf("*참고: 하나의 데이터 값은 엔터로 구분.\n");

			System.out.printf("이름: ");
			Scanner input = new Scanner(System.in);
			name[i] = input.next();
			for (int j = 0; j < name.length; j++) {
				System.out.printf(gua[j] + ": ");
				Scanner input2 = new Scanner(System.in);
				sung[i][j] = input2.nextInt();
				total[i] += sung[i][j]; // 사람당 총점
			}
			aver[i] = total[i] / total.length;// 사람당 평균
		}

		int total2[] = new int[5];
		int aver2[] = new int[5];

		for (int i = 0; i < sung.length; i++) {
			for (int j = 0; j < sung.length; j++) {
				total2[i] += sung[j][i];
			}
			aver2[i] = total2[i] / name.length;
		}
		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < name.length; i++) {

			System.out.println(name[i] + "님의 총점은" + total[i] + "평균은" + aver[i] + "입니다.");

		}

		System.out.println("-------------------------------------------------------");
		for (int i = 0; i < name.length; i++) {

			System.out.println(gua[i] + " 총점과 평균은" + total2[i] + "," + aver2[i] + "입니다.");

		}
		System.out.println("-------------------------------------------------------");

	}

}
