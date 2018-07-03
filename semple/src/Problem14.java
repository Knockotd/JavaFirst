import java.io.IOException;
import java.util.Scanner;

/*점수를 입력받아서 학점을 구하고,
 * 학점이 A이면 전액 장학금 대상이고,
 * 학점이 B이면 반액 장학금 대상이고,
 * 학점이 C이면 근로 장학금 대상이고,
 * 아니면, 장학금 대상이 아닙니다.
 * 출력합니다.
 */
public class Problem14 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("점수 : ");
		int a = sc.nextInt();
		char b = ' ';

		switch(a/10) {
		case 10: case 9:
			b='A';
			System.out.println("학점: A");
			break;
		case 8:
			b='B';
			System.out.println("학점: B");
			break;
		case 7:
			b='C';
			System.out.println("학점: C");
			break;
		default:
			b='D';
			System.out.println("학점: D");
			break;
		}
		System.out.println(b);
		
		switch(b) {
		case 'A':
			System.out.println("전액 장학금 대상자입니다.");
			break;
		case 'B':
			System.out.println("반액 장학금 대상자입니다.");
			break;
		case 'C':
			System.out.println("근로 장학금 대상자입니다.");
			break;
		default:
			System.out.println("장학금 대상자가 아닙니다.");
			break;
		
		}
		
		
		
	}

}
