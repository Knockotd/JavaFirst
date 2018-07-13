package synchronizedTest;

import java.util.ArrayList;

public class Share1 {
	// 저장 공간을 생성
	public static ArrayList<Character> List = new ArrayList<>();
	// 이 List는 하나밖에 만들어지지 않습니다.
	// 어디서든 Shara1.List는 이 변수를 뜻합니다.

	// 데어터를 저장하는 메소드
	public synchronized void save(char ch) {
		if (List.size() == 1) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		List.add(ch);
		System.out.println(ch + "를 저장했습니다.");
		// wait() 중인 스레드 깨우기
		notifyAll();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// 데이터를 꺼내는 메소드
	public synchronized void get() {
		if (List.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		char ch = List.remove(0);
		System.out.println(ch + "를 소비했습니다.");
		notifyAll();
	}
}
