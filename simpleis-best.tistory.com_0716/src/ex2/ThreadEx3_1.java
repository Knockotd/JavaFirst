package ex2;

public class ThreadEx3_1 extends Thread{
	private Account account;

	public ThreadEx3_1(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			account.delet();
		}
	}
}
