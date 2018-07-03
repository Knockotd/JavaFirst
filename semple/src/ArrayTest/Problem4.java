/*
 10명의 국어성적을 입력받아서, 점수가 80점 이상인 학생이 몇명인지를
 구하는 프로그램을 작성하세요.
 조건1] 점수는 0점이상이고, 100점 이하이어야 합니다.
 조건2] 예외처리
 */

package ArrayTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem4 {

	public static void main(String[] args) throws IOException {

		String name[] = new String [10];
		int kor[] = new int [10];
		int e=0;
		for(int i=0; i<kor.length; i++) {
			BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			System.out.printf("이름을 입력하세요 : ");
			name[i] = input.readLine();
			try {
				System.out.printf("국어 점수를 입력하세요 : ");
			kor[i] = Integer.parseInt(input.readLine());
			}
			catch(java.lang.NumberFormatException aa) {
				System.out.printf("알 수 없는 오류입니다.\n");
				i--;
				continue;
			}
			if(kor[i] > 100 || kor[i]<0) {
				System.out.printf("점수는 0~100점 사이입니다.\n");
				i--;
				continue;
			}
			
			if(kor[i]>=80) {
				e++;
			}
		}
		
		System.out.println("80점 이상인 학생은 "+e+"명입니다.");

	}

}
