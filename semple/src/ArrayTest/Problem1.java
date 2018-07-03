/*
 * 10개의 데이터를 초기화 시키고, 총점을 구하는 프로그램을
 * 작성해 봅니다. 배열사용.
 * 데이터 ] 90 80 60 70 93 100 50 66 100 88
 */

package ArrayTest;

public class Problem1 {
	public static void main(String[] args) {
		
		int sung[] = {90, 80, 60, 70, 93, 100, 50, 66, 100, 88};
		int total = 0;
		
		
		for(int i=0; i < sung.length; i++) {
			total += sung[i];
		}
		System.out.println("총점은 = " + total);
		
	}
}
