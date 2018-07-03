
/*
 * 1) 다음과 같은 결과가 나오도록 프로그래밍 하세요.
     성적 처리   
   ---------------
   성명: 홍길동
   국어: 92
   영어: 88
   수학: 80
   총점: 260
   평균: 86.666667
   
  * 2) 숫자 10이 2의 배수인지, 3의 배수인지, 4의 배수 인지를 체크하는 로직을 작성하세요.  */

import java.io.*;

public class exam1_8 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1)
		String name = "홍길동";
		int kor = 92, eng = 88, meth = 80, sum;
		double aver;

		sum = kor + eng + meth;
		aver = sum / 3.0;

		System.out.println("성명: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + meth);
		System.out.println("총점: " + sum);
		System.out.printf("평균: %3.6f \n", aver);

		// 2)
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader num = new BufferedReader(input);

		System.out.println("숫자를 입력하세요 : ");
		int nUm = Integer.parseInt(num.readLine());

		if (nUm % 2 == 0) {
			if (nUm % 4 == 0) {
				System.out.println(nUm + "은 2의 배수이면서 4의 배수입니다.");
			} else {
				System.out.println(nUm + "은 2의 배수입니다.");
			}
		} else if (nUm % 3 == 0) {
			System.out.println(nUm + "은 3의 배수입니다.");
		} else {
			System.out.println(nUm + "은 2,3,4의 배수가 아닙니다.");
		}

	}

}
