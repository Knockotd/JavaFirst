import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/*
===스무고개 게임!===
컴퓨터가 하나의 어떤 숫자를 생성합니다.
그러면 사람이 컴퓨터가 생성한 숫자가 무엇인지를 생각하여 알아맞추는 게임입니다.

조건1) 1부터 500까지 사이의 난수가 발생하도록 합니다.
조건2) 입력 횟수를 카운트합니다.
조건3) 큰수인지, 작은수 인지를 판단하여 알려줍니다.
조건4) 정답을 입력한 경우, "대박 정답이에요!"를 표시합니다.
조건5) 예외처리까지 감안하여 프로그램을 작성하세요.
*/
@SuppressWarnings("unused")
public class Problem17 {

	public static void main(String[] args) throws IOException {

		while (true) {
			int c = 0;

			Random Num = new Random();
			int num = Num.nextInt(500) + 1;

			System.out.printf("컴퓨터가 숫자를 생각했어요.\n당신이 생각한 수를 말해주세요.");

			while (true) {
				if (c > 19) {
					System.out.printf("******************\n");
					System.out.printf("스무고개 실패!\n정답 입력 횟수를 20회를 초과했어요 ㅠㅠ\n다음 기회에~!");
					break;
				} else {
					int ynum = 0;

					Scanner Ynum = new Scanner(System.in);
					try {
						// Exception in thread "main" java.util.InputMismatchException //ctrl + v
						// Exception in thread "main" java.util.InputMismatchException //아무문자 막 입력했을 때.
						// //숫자로 받아야 한다.
						ynum = Ynum.nextInt();
					} catch (Exception ime) {
						System.out.println("");
						System.out.println("오류입니다. 숫자로 입력하세요!");
					}
					c++;
					if (num == ynum) {
						System.out.printf("******************\n");
						System.out.printf("대박, 정답이에요!\n");
						System.out.printf("******************\n");
						System.out.printf("%d번 만에 맞췄어요.\n", c);
						break;
					} else {
						if (ynum > 500 || ynum < 0) {
							System.out.printf("입력 오류예요. 1~500 사이의 숫자만 입력해주세요.\n");

						} else {
							if (num > ynum) {
								System.out.printf("%d 보다 큰 수예요~\n더 노력해보세요!\n", ynum);
								System.out.printf("******************\n");
								continue;
							} else {
								System.out.printf("%d 보다 작은 수예요~\n더 노력해보세요!\n", ynum);
								System.out.printf("******************\n");
								continue;
							}
						}

					}

				}

			}

		}
	}
}
