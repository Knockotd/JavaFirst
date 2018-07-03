package method;

class Task {
	// Hello Java를 3번 출력해주는 메소드
	public void javaDisplay() {
		for (int i = 0; i < 3; i = i + 1) {
			System.out.println("Hello Java");
		}
	}

	// 1부터 100까지 더해서 출력해주는 메소드
	public void tot() {
		int sum = 0;
		for (int i = 1; i < 101; i = i + 1) {
			sum = sum + i;
		}
		System.out.println("합계:" + sum);

	}

	// 1부터 100까지 더한 결과를 리턴해주는 메소드
	public int tot2() {
		int sum = 0;
		for (int i = 1; i < 101; i = i + 1) {
			sum = sum + i;
		}
		return sum;

	}
	
	public int tot3(int n) {
		int sum = 0;
		for (int i = 1; i < n; i = i + 1) {
			sum = sum + i;
		}
		return sum;

	}

	//로그인 처리 메소드
	public boolean login(String id, String pw) {
		boolean result = false;
		if(id.equals("root") && pw.equals("1234")) {
			result = true;
		}
		return result;
	}
	
	
	//회원 탈퇴 메소드
public boolean leave(String id, String pw) {
	boolean result = false;
	if(id.equals("root") && pw.equals("1234")) {
		result = true;
	}
	return result;
	}
}
