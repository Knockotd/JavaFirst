package method;

public class Main {

	public static void main(String[] args) {

		// Hello Java 3번 출력
		// 연속된 경우는 유지보수를 위해서 반복문 사용
		/*
		 * System.out.println("Hello Java"); System.out.println("Hello Java");
		 * System.out.println("Hello Java");
		 */

		/*
		 * // Hello Java 3번 출력
		 * 
		 * for (int i = 0; i < 3; i = i + 1) { System.out.println("Hello Java"); }
		 * 
		 * 
		 * // Hello C++를 1번 출력 System.out.println("Hello C++");
		 * 
		 * // Hello Java 3번 출력
		 * 
		 * for (int i = 0; i < 3; i = i + 1) { System.out.println("Hello Java"); }
		 */

		// Task 클래스의 인스턴스 생성
		Task ins = new Task();
		// 메소드 호출
		ins.javaDisplay();

		System.out.println("Hello C++");

		// 메소드 호출
		ins.javaDisplay();

		new Task().tot();
		// 1번만 사용할 때는 이렇게 적어도 된다. 실제적으로는 new가 인스턴스를 만들고 .으로 메소드를 불러오는 것이다.
		// 위의 ins는 여러번 쓰려고 이름을 정해준 것이라고 볼 수 있다.

		// new Task().tot2(); //5050; 이렇게 불러와진다.
		int result = new Task().tot2(); // result 변수에 값이 저장이된다.
		System.out.println("합계:" + result);

		int result2 = new Task().tot3(50); // argument(인수)를 준 경우. 프로그램이 좀 더 유연해진다.
		System.out.println("합계:" + result2);

		// 로그인
		boolean r = new Task().login("xxx", "yyy");

		if (r == true) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("없는 아이디 이거나 비밀번호가 틀렸습니다.");
		}

		// 탈퇴
		boolean l = new Task().leave("xxx", "yyy");

		if (l == true) {
			System.out.println("탈퇴 성공");
		} else {
			System.out.println("탈퇴 실패.");
		}

		//데이터 베이스와 비교를 시키고 / HTML의 링크로 메세지 표시 시킬 수 있다.
		
		
		
		
	}

}
