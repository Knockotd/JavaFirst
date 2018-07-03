/*
 * 1) 1부터 100사이의 수를 이용하여 for문으로 홀수의 합계를 구하는 프로그램을 2가지 방법으로 작성하세요.
 * 2) 1)에서 while문을 이용하여 2가지 방법으로 풀어보세요.
 */

public class exam1_1 {

	public static void main(String[] args) {

		// 1)
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 != 0) {
				sum += i;
			}
		}
		System.out.println(sum);

		sum = 0;
		for (int j = 1; j <= 100; j += 2) {
			sum += j;

		}
		System.out.println(sum);

		// 2)
		sum = 0;
		int i = 0;
		while (true) {
			i++;
			if (i < 101) {
				if (i % 2 != 0) {
					sum = sum + i;
				}
			} else
				break;
		}
		System.out.println(sum);
		
		sum = 0;
		i = 0;
		while (i<100) {
			i++;
				if (i % 2 != 0) {
					sum = sum + i;
				}
		}
		System.out.println(sum);
		
		
	}
}
