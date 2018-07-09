package clone_test;

import java.util.Scanner;

public class LottoMain {

	public static void main(String[] args) {
		// 1 ~ 45까지 중복되지 않는 6개의 정수 저장
		// 데이터를 묶을 수 있는 것 : 배열, 클래스
		// 배열 : 동일한 자료형을 묶을 수 있다.(0,1,2,3,4... 반복문에서 쓸 수 있다.)
		// 클래스 : 동일하거나 다른 자료형을 묶을 수 있다. (내부구성요소가 독립적이다.)(반복문에서 쓸 수 없다)

		// 6개의 정수를 저장 할 수 있는 배열을 생성.
		int[] lotto = new int[6];
		int size = lotto.length;
		// length : 데이터 개수
		// 참조형(배열, 클래스)은 기본적으로 값을 넣지 않아도 기본갑(int = 0)을 가진다
		int i, j;
		// 인덱스 변수라고들 한다.

		// 6번 입력 받는 코드를 생성
		Scanner sc = new Scanner(System.in);

		for (i = 0; i < size; i = i + 1) {
			try {
				System.out.println("1~45 사이의 정수를 입력하세요.");
				String temp = sc.nextLine();
				lotto[i] = Integer.parseInt(temp);
				// 드모르간의 법칙
				// !(ar[i] >= 1 && ar[i] < = 45) //사람이 직관적으로 보기에는 이게 좋다.
				// ar[i] < 1 || ar[i] > 45 //컴퓨터에게는 연산자가 1개 적은 이게 좋고.

				if (!(lotto[i] >= 1 && lotto[i] <= 45)) {
					System.out.println("1~45 사이의 정수를 입력하세요.");
					i = i - 1;
					continue;
				}

				// 이전에 입력된 값들과 비교 - 중복 검사
				//	j가 0인데, 조건문이 -1이고 증감 여부가 증가라면,
				// 조건을 만족하지 않아 반복문을 돌지 않는다.
/*				for (j = 0; j <= i - 1; j = j + 1) {
					// 이전 데이터와 방금 입력받은 데이터가 같으면 반복문 종료
					if (lotto[i] == lotto[j]) {
						break;
					}

				}
				// 이전 데이터와 방금 입력된 데이터가 동일하면
				if (j != i) {
					System.out.println("중복된 데이터는 입력할 수 없습니다.");
					i = i - 1;
					continue;
				}*/
				
				if(i != 0) {
					if(lotto[i] == lotto[i-1]) {
						System.out.println("중복된 데이터는 입력할 수 없습니다.");
						i=i-1;
						continue;
					}
				}

			} catch (Exception e) {
				System.out.println("정수를 입력하세요.");
				i = i - 1;
				// catch다음에 내용이 있으면 continue;를 입력해야한다.
			}
		}
		sc.close();

		// 배열의 모든 데이터를 출력하는 코드 생성
		for (i = 0; i < size; i = i + 1) {
			System.out.printf("%2d", lotto[i]);
		}

	}

}
