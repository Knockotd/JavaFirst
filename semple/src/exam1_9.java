/*소문자 a에서 z까지를 출력하는 프로그램을 do~while을 이용하여 프로그램 하세요.
*/
public class exam1_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 96;
		do {
			i++;
			System.out.printf("%c, ", i);
		} while (i < 121);
		i++;
		System.out.printf("%c", i);

	}

}
