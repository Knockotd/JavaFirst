package ex2;

public class Main {

	public static void main(String[] args) {
		Account account = new Account();
		ThreadEx3 th1 = new ThreadEx3(account);
		th1.start();
		ThreadEx3_1 th2 = new ThreadEx3_1(account);
		th2.start();
	}

}
