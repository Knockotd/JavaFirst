import java.io.IOException;

/*특수문자, 숫자, 알파벳 문자, 제어 문자 등 데이터를 입력받아서
각 문자의 개수를 출력하는 프로그램을 작성하세요.*/
public class Problem1 {

	public static void main(String[] args) throws IOException {
		int data = 0;
		int alphabet = 0;
		int digit = 0;
		int control = 0;
		int special = 0;
		int other = 0;

		while ((data = System.in.read()) != -1) {
			if (data >= 'A' && data <= 'Z' || data >= 'a' && data <= 'z')
				alphabet++;
			else if (data >= '0' && data <= '9')
				digit++;
			else if (data == '\t' || data == '\r' || data == '\n' || data == ' ')
				control++;
			else if (data >= '#' && data == '/')
				special++;
			else
				other++;
		}
		System.out.println("알파벳 문자의 개수는 = " + alphabet);
		System.out.println("숫자의 개수는 = " + digit);
		System.out.println("제어문자의 개수는 = " + control);
		System.out.println("특수문자의 개수는 = " + special);
		System.out.println("기타의 개수는 = " + other);
	}

}
