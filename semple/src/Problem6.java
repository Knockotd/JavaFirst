import java.util.Scanner;

/*입력: 5+4
출력: 5+4 = 9*/
public class Problem6 {

	public static void main(String[] args) {
		
//		while (true) {
			
/*			Scanner sc = new Scanner(System.in);
			//오브젝트가 묶여있어서 나중에 따로 빼야할 가능성이 있다면 구분을 해주는게 좋다.
			
			System.out.printf("첫번째 값 입력: ");
			int a = sc.nextInt();
			System.out.printf("연산자 입력: ");
			String b = sc.next();
			System.out.printf("두번째 값 입력: ");
			int c = sc.nextInt();
*/
			
			
			int a = Integer.parseInt(args[0]);
			String b = args[1];
			int c = Integer.parseInt(args[2]);	//float면 Iteger대신 줘도 된다.
			
			//왼쪽 파일이름 우클릭 런 에즈- 런 설정 - 아규먼... - 거기서 띄어쓰기로 구분하면서 인자 입력.
			//실행 전에 파일 이름이 맞는지 왼쪽에 파일 이름이 있는지. 확인을 먼저 해야한다.
			
			// equals는 문자열 비교 // 참조형 데이터 타입인 경우
			// == 기본형 데이터 타입일 때
			
			if (b.equals("+")) {
				System.out.println("출력: " + a + b + c + " = " + (a + c));
			} else if (b.equals("-")) {
				System.out.println("출력: " + a + b + c + " = " + (a - c));
			} else if (b.equals("*")) {
				//*정규 표현식에 뭔가 쓰이는게 있어서 곱셈 모양으로 하면 된다.
				System.out.println("출력: " + a + b + c + " = " + (a * c));
			} else if (b.equals("/")) {
				System.out.println("출력: " + a + b + c + " = " + (a / c));
			} else {
				System.out.println("출력: " + a + b + c + " = " + (a % c));
			}
//			continue;
//		}
	}

}
