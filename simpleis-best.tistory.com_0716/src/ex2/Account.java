package ex2;

public class Account {
	private int balance;

	// 잔액을 추가하는 메소드
	public synchronized  void add() {
		System.out.println("입금 전 잔액: " + balance);
		balance = balance + 1000;
		//wait(); 중인 메소드 깨우기
		notify();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("입금 후 잔액: " + balance);
	}

	// 잔액을 감소하는 메소드
	public synchronized void delet() {

		if (balance < 1000) {
			// notify()를 호출 할 때까지 대기합니다.
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// this - 내 자신의 자원을 사용하는 경우
		// 이 코드는 한번에 수행되도록 설정

		System.out.println("출금 전 잔액 : " + balance);
		balance = balance - 1000;
		// 1초 대기
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("출금 후 현재 잔액 : " + balance);

	}

}
