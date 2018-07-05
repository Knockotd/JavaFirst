package abstracttest;

public class Iphone extends Smartphone {

	public void call() {

		double x = 10.7;
		// 실수를 정수로 강제 형 변환: 소수가 버려집니다.
		System.out.println("x: " + (int) x);

	}

	public void array() {
		int[] y = new int[10];

		for (int i = 0; i < 10; i = i + 1) {
			y[i] = i + 1;
		}
		System.out.println("y: " + y[9]);
	}

}
