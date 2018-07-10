package Arrays;

import java.util.Arrays;

public class Main1 {

	public static void main(String[] args) {
		String[] ar = { "빨강색", "주황색", "노랑색", "초록색", "파란색", "남색", "보라색" };

		// ar 정렬
		Arrays.sort(ar);
		for (String a : ar) {
			System.out.println(a);
		}

		// 노랑색의 위치 검색
		int idx = Arrays.binarySearch(ar, "노랑색");
		System.out.println(idx);
		// 초록색의 위치 검색
		int idx2 = Arrays.binarySearch(ar, "초록색");
		System.out.println(idx2);
		// 정렬이 되어 있어야 옳바른 결과가 나온다.

	}

}
