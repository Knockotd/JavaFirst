package threadTest;

public class ThreadMain3 {

	public static void main(String[] args) {
		// Runnable 인터페이스를 implements한 클래스를 이용해서 스레드시작
		ThreadTest3 obj = new ThreadTest3();
		Thread th = new Thread(obj);
		// Runnable에는 thread 메소드가 없어서 생성자에 인스턴스를 넣어주어서 구연해야합니다.
		th.start();

	}

}
