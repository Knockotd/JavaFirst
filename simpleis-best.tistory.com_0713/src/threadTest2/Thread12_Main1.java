package threadTest2;

public class Thread12_Main1 {

	public static void main(String[] args) {
		// Thread2 클래스 사용
		/*
		 * Thread2 mo1 = new Thread2(); Thread2 mo2 = new Thread2(); Thread2 mo3 = new
		 * Thread2(); Thread2 mo4 = new Thread2(); mo1.start(); mo2.start();
		 * mo3.start(); mo4.start();
		 */

		// Thread1 클래스 사용
		Thread1 mo1 = new Thread1();
		Thread1 mo2 = new Thread1();
		Thread1 mo3 = new Thread1();
		Thread1 mo4 = new Thread1();
		Thread momo1 = new Thread(mo1);
		Thread momo2 = new Thread(mo2);
		Thread momo3 = new Thread(mo3);
		Thread momo4 = new Thread(mo4);

		momo1.start();
		momo2.start();
		momo3.start();
		momo4.start();

	}

}
