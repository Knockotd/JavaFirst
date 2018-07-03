public class NestedForStar {

	public static void main(String[] args) { // 중첩for
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();// 줄 바꿈명령
		}

		for (int i = 0; i < 11; i++) {
			for (int j = 0; j <= 10 - i; j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
}